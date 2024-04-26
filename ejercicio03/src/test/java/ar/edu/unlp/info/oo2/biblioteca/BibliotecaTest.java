package ar.edu.unlp.info.oo2.biblioteca;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	Biblioteca biblioteca = new Biblioteca();

	@BeforeEach
	void setUp() {
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
	}
	
	@Test
	void testBiblioteca() {
		System.out.print(biblioteca.exportarSocios());
	}

}
