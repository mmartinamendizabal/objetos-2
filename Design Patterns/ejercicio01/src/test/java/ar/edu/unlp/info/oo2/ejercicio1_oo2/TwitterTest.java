package ar.edu.unlp.info.oo2.ejercicio1_oo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwitterTest {
	Twitter x;
	Usuario pikachu;

	@BeforeEach
	void setUp() {
		x = new Twitter();
		pikachu=x.createUser("pikachu");
	}
	@Test
	void testCreateUserFails() {
		assertNull(x.createUser("pikachu"));
	}
	@Test
	void testCreateUserSuccessfully() {
		assertEquals("charmander",x.createUser("charmander").getScreenName());
	}

}
