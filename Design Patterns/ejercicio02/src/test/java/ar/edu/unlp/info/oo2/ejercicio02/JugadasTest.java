package ar.edu.unlp.info.oo2.ejercicio02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JugadasTest {


	@Test
	void testJugar() {
		Jugada miJugada=new Lagarto();
		Jugada otra=new Tijera();
		assertEquals("Tijera decapita lagarto", otra.jugarContraLagarto(miJugada));
	}

}
