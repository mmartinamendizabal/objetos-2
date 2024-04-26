package ar.edu.unlp.info.oo2.ejercicio02;

public class Tijera implements Jugada {


	@Override
	public String jugarContraPiedra(Jugada otra) {
		return "Piedra aplasta tijera";
	}

	@Override
	public String jugarContraPapel(Jugada otra) {
		return "Tijera corta papel";
	}

	@Override
	public String jugarContraTijera(Jugada otra) {
		return "Empate";
	}

	@Override
	public String jugarContraLagarto(Jugada otra) {
		return "Tijera decapita lagarto";
	}

	@Override
	public String jugarContraSpock(Jugada otra) {
		return "Spock rompe tijera";
	}
}