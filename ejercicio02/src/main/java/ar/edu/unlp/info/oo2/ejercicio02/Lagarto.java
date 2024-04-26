package ar.edu.unlp.info.oo2.ejercicio02;

public class Lagarto implements Jugada {

	@Override
	public String jugarContraPiedra(Jugada otra) {
		return "Piedra aplasta lagarto";
	}

	@Override
	public String jugarContraPapel(Jugada otra) {
		return "Lagarto come papel";
	}

	@Override
	public String jugarContraTijera(Jugada otra) {
		return "Tijera decapita lagarto";
	}

	@Override
	public String jugarContraLagarto(Jugada otra) {
		return "Empate";
	}

	@Override
	public String jugarContraSpock(Jugada otra) {
		return "Lagarto envenena Spock";
	}
    }
