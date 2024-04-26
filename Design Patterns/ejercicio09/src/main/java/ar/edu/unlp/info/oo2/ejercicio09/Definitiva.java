package ar.edu.unlp.info.oo2.ejercicio09;

import java.util.stream.Collectors;

public class Definitiva extends State{

	public Definitiva(Excursion excursion) {
		super(excursion);
	}

	@Override
	public String darInformacion() {
		// nombre, costo, fechas, punto de encuentro, los mails de los usuarios inscriptos y cantidad de usuarios faltantes para alcanzar el cupo máximo.
		StringBuilder str= new StringBuilder();
		str.append(super.darInformacion());
		str.append(this.getMailsUsuarios());
		str.append("\n"+"Cantidad de inscriptos faltantes hasta el cupo máximo: "+this.getExcursion().faltanHastaCupoMax());
		return str.toString();
	}
	private String getMailsUsuarios() {
		return this.getExcursion().getInscriptos().stream()
                .map(ins -> ins.getEmail())
                .collect(Collectors.joining("\n"));
	}

	@Override
	public void inscribir(Usuario unUsuario) {
		if (!this.getExcursion().alcanzoElMaximo())
			this.getExcursion().getInscriptos().add(unUsuario);
		else { 
			EnEspera enEspera = new EnEspera(this.getExcursion());
			enEspera.inscribir(unUsuario);
			this.getExcursion().setEstado(enEspera);
		}
	}

}
