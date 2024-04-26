package ar.edu.unlp.info.oo2.ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemporarioTest {
	

	@Test
	void testBasico() {
		Empleado empleadoPlanta = new Temporario (false, 2, 40);
		assertEquals(32000, empleadoPlanta.basico());
	}
	@Test
	void testAdicionalCasadoConHijos() {
		Empleado empleadoPlanta = new Temporario (true, 3, 40);
		assertEquals(11000, empleadoPlanta.adicional());
	}
	@Test
	void testAdicionalSolteroSinHijos() {
		Empleado empleadoPlanta = new Temporario (false, 0, 8);
		assertEquals(0, empleadoPlanta.adicional());
	}

}
