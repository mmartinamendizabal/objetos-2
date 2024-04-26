package ar.edu.unlp.info.oo2.ejercicio06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MixtaTest {
	Topografia mixta1 = new Mixta(new Agua(), new Tierra(), new Agua(), new Tierra());
	Topografia mixtaAnidada = new  Mixta(new Agua(), new Tierra(), new Agua(), new Mixta(new Tierra(), new Agua(), new Tierra(), new Agua()));
	Topografia mixtaAnidada2 = new  Mixta( new Tierra(),new Agua(), new Agua(), new Mixta(new Tierra(), new Agua(), new Tierra(), new Agua()));

	@Test
	void testProporcionAgua() {
		assertEquals(0.5, mixta1.proporcionAgua());
	}
	
	@Test
	void testEsIgualMixtaExitoso() {
		Mixta mixta2 =  new Mixta(new Agua(), new Tierra(), new Agua(), new Tierra());
		assertTrue(mixta1.esIgual(mixta2));
	}
	
	@Test
	void testEsIgualMixtaFallido() {
		Mixta mixta3 = new Mixta(new Tierra(), new Agua(), new Tierra(), new Agua());
		assertFalse(mixta1.esIgual(mixta3));
	}
	
	@Test
	void testEsIgualMixtasAnidadasFallido() {
		assertFalse(mixta1.esIgual(mixtaAnidada));
	}
	
	@Test
	void testEsIgualAnidadasMismaProporcionFallido() {
		assertFalse(mixtaAnidada2.esIgual(mixtaAnidada));
	}
	
	@Test
	void testEsIgualMixtasAnidadasExitoso() {
		Mixta mixta4 = new  Mixta(new Agua(), new Tierra(), new Agua(), new Mixta(new Tierra(), new Agua(), new Tierra(), new Agua()));
		assertTrue(mixtaAnidada.esIgual(mixta4));
	}
}
