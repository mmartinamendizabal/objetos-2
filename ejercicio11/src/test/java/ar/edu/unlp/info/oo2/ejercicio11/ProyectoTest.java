package ar.edu.unlp.info.oo2.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class ProyectoTest {
	Proyecto p = new Proyecto("Vacaciones de invierno", LocalDate.of(2024, 4, 20), LocalDate.of(2024, 4, 30), "salir con amigos", 3, 3000);
	/* Implemente un test para aprobar un proyecto con las siguientes características: 
	 * (i) se encuentra en evaluación, 
	 * (ii) se llama “Vacaciones de invierno”, 
	 * (iii) tiene como objetivo “salir con amigos”, y 
	 * (iv) lo integran 3 personas.*/

	@Test
	void testPrecio() {
		assertEquals(96300, p.precioDelProyecto());
	}
	@Test
	void testCosto() {
		assertEquals(90000, p.costoDelProyecto());
	}
	@Test
	void testEstado() {
		p.aprobarEtapa();
		assertEquals("en evaluacion", p.getEstado());
	}
	@Test
	void testModificarMargenExitoso() {
		System.out.print(p.modificarMargen(8));;
	}

}
