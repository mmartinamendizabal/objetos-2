package ar.edu.unlp.info.oo2.ejercicio09;


public abstract class State {
	private Excursion excursion;
	
	public State (Excursion excursion) {
		this.excursion=excursion;
	}
	protected Excursion getExcursion() {
		return this.excursion;
	}
	public abstract void inscribir(Usuario unUsuario);
	
	public String darInformacion() {
		StringBuilder str= new StringBuilder();
		str.append("Nombre: "+this.getExcursion().getNombre()).append("\n");
		str.append("Costo: "+this.getExcursion().getCosto()).append("\n");
		str.append("Fecha de Inicio: "+this.getExcursion().getFechaInicio()).append("\n");
		str.append("Fecha de Fin: "+this.getExcursion().getFechaFin()).append("\n");
		str.append("Punto de Encuentro: "+this.getExcursion().getPuntoDeEncuentro()).append("\n");
		return str.toString();
	};

}
