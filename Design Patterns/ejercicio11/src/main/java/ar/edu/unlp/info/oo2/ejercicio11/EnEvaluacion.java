package ar.edu.unlp.info.oo2.ejercicio11;

public class EnEvaluacion extends State{
	private int margenBase;
	private int margenTope;

	public EnEvaluacion(Proyecto p) {
		super(p);
		this.margenBase=11;
		this.margenTope=15;
	}

	@Override
	public void aprobarEtapa() {
		this.getProyecto().setEstado(new Confirmado(this.getProyecto()));
	}

	@Override
	public void modificarMargen(double nuevoMargen) {
		if (this.margenDentroDelRango(nuevoMargen, this.margenBase, this.margenTope))
			this.getProyecto().setMargen(nuevoMargen);
	}

	@Override
	public String toString() {
		return "en evaluacion";
	}


}
