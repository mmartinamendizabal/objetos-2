package ar.edu.unlp.info.oo2.ejercicio11;

public class EnConstruccion extends State{
	private int margenBase;
	private int margenTope;

	public EnConstruccion(Proyecto p) {
		super(p);
		this.margenBase=8;
		this.margenTope=10;
	}

	@Override
	public void aprobarEtapa() {
		if (this.getProyecto().precioDelProyecto()!=0)
			this.getProyecto().setEstado(new EnEvaluacion(this.getProyecto()));
		else 
			throw new RuntimeException("No se puede aprobar esta etapa hasta que el precio no sea mayor a 0");
	}

	@Override
	public void modificarMargen(double nuevoMargen) {
		if (this.margenDentroDelRango(nuevoMargen, this.margenBase, this.margenTope))
			this.getProyecto().setMargen(nuevoMargen);
	}


	@Override
	public String toString() {
		return "en construccion";
	}

}
