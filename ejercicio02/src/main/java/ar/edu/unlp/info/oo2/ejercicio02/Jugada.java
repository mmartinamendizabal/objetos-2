package ar.edu.unlp.info.oo2.ejercicio02;

public interface Jugada {
	String jugarContraPiedra(Jugada otra);
	String jugarContraPapel(Jugada otra);
	String jugarContraTijera(Jugada otra);
	String jugarContraLagarto(Jugada otra);
	String jugarContraSpock(Jugada otra);
}
