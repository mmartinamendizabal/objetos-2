package ar.edu.unlp.info.oo2.ejercicio02;

public class Spock implements Jugada {
	@Override
	public String jugarContraPiedra(Jugada otra) {
		return "Spock vaporiza piedra";
	}

	@Override
	public String jugarContraPapel(Jugada otra) {
		return "Papel desaprueba Spock";
	}

	@Override
	public String jugarContraTijera(Jugada otra) {
		return "Spock rompe tijera";
	}

	@Override
	public String jugarContraLagarto(Jugada otra) {
		return "Lagarto envenena Spock";
	}

	@Override
	public String jugarContraSpock(Jugada otra) {
		return "Empate";
	}
}