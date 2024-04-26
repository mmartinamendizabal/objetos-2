package ar.edu.unlp.info.oo2.ejercicio11;

public class Confirmado extends State{

	public Confirmado(Proyecto p) {
		super(p);
	}

	@Override
	public void aprobarEtapa() {
		
	}

	@Override
	public void modificarMargen(double nuevoMargen) {
		
	}

	@Override
	public String toString() {
		return "confirmado";
	}
	

}
