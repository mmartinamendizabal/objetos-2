package ar.edu.unlp.info.oo2.ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasanteTest {

	@Test
	void testAdicionalConExamenes() {
		Empleado pasante = new Pasante (5);
		assertEquals(10000, pasante.adicional());
	}
	@Test
	void testAdicionalSinExamenes() {
		Empleado pasante = new Pasante (0);
		assertEquals(0, pasante.adicional());
	}

}
