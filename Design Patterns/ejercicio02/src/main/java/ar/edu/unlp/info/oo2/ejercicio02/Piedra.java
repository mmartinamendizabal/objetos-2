package ar.edu.unlp.info.oo2.ejercicio02;

public class Piedra implements Jugada {

	@Override
	public String jugarContraPiedra(Jugada otra) {
		return "Empate";
	}

	@Override
	public String jugarContraPapel(Jugada otra) {
		return "Papel envuelve piedra";
	}

	@Override
	public String jugarContraTijera(Jugada otra) {
		return "Piedra aplasta tijera";
	}

	@Override
	public String jugarContraLagarto(Jugada otra) {
		return "Piedra aplasta lagarto";
	}

	@Override
	public String jugarContraSpock(Jugada otra) {
		return "Spock vaporiza piedra";
	}
}