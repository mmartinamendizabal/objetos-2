package ar.edu.unlp.info.oo2.ejercicio06;

public class Tierra extends Topografia{

	@Override
	public double proporcionAgua() {
		return 0;
	}

	@Override
	public boolean esIgual(Agua agua) {
		return false;
	}

	@Override
	public boolean esIgual(Tierra tierra) {
		return true;
	}

	@Override
	public boolean esIgual(Mixta mixta) {
		return false;
	}

	@Override
	public boolean esIgual(Topografia t) {
		return t.esIgual(this);
	}

}
