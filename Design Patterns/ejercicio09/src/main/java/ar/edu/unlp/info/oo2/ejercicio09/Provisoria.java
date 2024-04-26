package ar.edu.unlp.info.oo2.ejercicio09;

public class Provisoria extends State{

	public Provisoria(Excursion excursion) {
		super(excursion);
	}
	
	@Override
	public String darInformacion() {
		// nombre, costo, fechas, punto de encuentro, cantidad de usuarios faltantes para alcanzar el cupo mínimo.
		return super.darInformacion()+"Cantidad de inscriptos faltantes hasta el cupo mínimo: "+this.getExcursion().faltanHastaCupoMin();
	}

	@Override
	public void inscribir(Usuario unUsuario) {
		this.getExcursion().getInscriptos().add(unUsuario);
		if (this.getExcursion().alcanzoElMinimo()) {
			this.getExcursion().setEstado(new Definitiva (this.getExcursion()));
		}
		
	}

}
