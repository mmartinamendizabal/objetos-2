package ar.edu.unlp.info.oo2.ejercicio11;

public abstract class State {
	private Proyecto proyecto;
	
	
	public State (Proyecto p) {
		this.proyecto=p;
	}
	protected Proyecto getProyecto() {
		return this.proyecto;
	}
	protected boolean margenDentroDelRango(double nuevoMargen, double base, double tope) {
		return (nuevoMargen >= base) && (nuevoMargen <= tope);
	}
	public void cancelarProyecto() {
		this.proyecto.setObjetivo(this.proyecto.getObjetivo() + " (Cancelado)");
		this.proyecto.setEstado(new Cancelado(this.proyecto));
	}
	
	public abstract void aprobarEtapa();
	public abstract void modificarMargen(double nuevoMargen);
	public abstract String toString();


}
