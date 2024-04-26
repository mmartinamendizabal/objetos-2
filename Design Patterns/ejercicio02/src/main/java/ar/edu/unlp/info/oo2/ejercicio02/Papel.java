package ar.edu.unlp.info.oo2.ejercicio02;

public class Papel implements Jugada {


	@Override
	public String jugarContraPiedra(Jugada otra) {
		return "Papel envuelve piedra";
	}

	@Override
	public String jugarContraPapel(Jugada otra) {
		return "Empate";
	}

	@Override
	public String jugarContraTijera(Jugada otra) {
		return "Tijera corta papel";
	}

	@Override
	public String jugarContraLagarto(Jugada otra) {
		return "Lagarto come papel";
	}

	@Override
	public String jugarContraSpock(Jugada otra) {
		return "Papel desaprueba Spock";
	}
}
