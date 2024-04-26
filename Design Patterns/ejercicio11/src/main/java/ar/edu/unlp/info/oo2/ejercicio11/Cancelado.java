package ar.edu.unlp.info.oo2.ejercicio11;

public class Cancelado extends State{

	public Cancelado(Proyecto p) {
		super(p);
	}

	@Override
	public void aprobarEtapa() {
		
	}

	@Override
	public void modificarMargen(double nuevoMargen) {
		
	}
	
	@Override
	public void cancelarProyecto() {
		
	}

	@Override
	public String toString() {
		return "cancelado";
	}
	

}
