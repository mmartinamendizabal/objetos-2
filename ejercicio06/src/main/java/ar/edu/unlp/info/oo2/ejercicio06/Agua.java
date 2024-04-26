package ar.edu.unlp.info.oo2.ejercicio06;

public class Agua extends Topografia {

	@Override
	public double proporcionAgua() {
		return 1;
	}

	@Override
	public boolean esIgual(Agua agua) {
		return true;
		
	}
	public boolean esIgual(Topografia t) {
		return t.esIgual(this);
	}

	@Override
	public boolean esIgual(Tierra tierra) {
		return false;
	}

	@Override
	public boolean esIgual(Mixta mixta) {
		return false;
	}
	

}
