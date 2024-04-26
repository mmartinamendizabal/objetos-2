package ar.edu.unlp.info.oo2.ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
	Empleado empleadoPlanta = new Planta (false, 3, 8);
	Empleado empleadoTemp = new Temporario (true, 0, 40);
	Empleado pasante = new Pasante (5);


	@Test
	void testSueldoPlanta() {
		assertEquals(64400, empleadoPlanta.sueldo());
		//basico + adicional - descuento
		//50000 + 22000 - (6500 + 1100)
	}
	
	@Test
	void testSueldoTemporario() {
		assertEquals(32590, empleadoTemp.sueldo());
		//32000 + 5000 - (4160 + 250)
	}
	
	@Test
	void testSueldoPasante() {
		assertEquals(26900, pasante.sueldo());
		//20000 + 10000 - (2600 + 500)
	}

}
