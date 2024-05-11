package ar.edu.unlp.info.oo2.ejercicio14;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseAccessProxyTest {
	private DatabaseAccessProxy proxy;

	@BeforeEach
	public void setUp() throws Exception {
		this.proxy = new DatabaseAccessProxy(new DatabaseRealAccess());
	}

	@Test
	public void testGetSearchResults() {
		Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.proxy.getSearchResults("select * from comics where id=1");});
		assertEquals("You have to log in to do this operation.",exceptionPending.getMessage());

		this.proxy.logIn("4gTyde670@j");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=10"));
        
        this.proxy.logOut();
        Exception exceptionPending2 = assertThrows(RuntimeException.class, () -> {this.proxy.getSearchResults("select * from comics where id=10");});
		assertEquals("You have to log in to do this operation.",exceptionPending2.getMessage());
		
		this.proxy.logIn("aaa");
		Exception exceptionPending3 = assertThrows(RuntimeException.class, () -> {this.proxy.getSearchResults("select * from comics where id=1");});
		assertEquals("You have to log in to do this operation.",exceptionPending3.getMessage());
	}
	
    @Test
    public void testInsertNewRow() {
    	Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));});
		assertEquals("You have to log in to do this operation.",exceptionPending.getMessage());
		
		this.proxy.logIn("4gTyde670@j");
		assertEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.proxy.getSearchResults("select * from comics where id=3"));
        
        this.proxy.logOut();
        Exception exceptionPending2 = assertThrows(RuntimeException.class, () -> {this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));});
		assertEquals("You have to log in to do this operation.",exceptionPending2.getMessage());
       
		this.proxy.logIn("aaa");
		Exception exceptionPending3 = assertThrows(RuntimeException.class, () -> {this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));});
		assertEquals("You have to log in to do this operation.",exceptionPending3.getMessage());
    }

}