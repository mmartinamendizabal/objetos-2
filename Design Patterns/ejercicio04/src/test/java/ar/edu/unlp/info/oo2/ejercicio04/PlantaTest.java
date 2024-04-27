package ar.edu.unlp.info.oo2.ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlantaTest {
	
	@Test
	void testBasico() {
		Empleado empleadoPlanta = new Planta (false, 3, 8);
		assertEquals(50000, empleadoPlanta.basico());
	}
	@Test
	void testAdicionalCasadoConHijos() {
		Empleado empleadoPlanta = new Planta (true, 3, 8);
		assertEquals(27000, empleadoPlanta.adicional());
	}
	@Test
	void testAdicionalSolteroSinHijos() {
		Empleado empleadoPlanta = new Planta (false, 0, 8);
		assertEquals(16000, empleadoPlanta.adicional());
	}

}
