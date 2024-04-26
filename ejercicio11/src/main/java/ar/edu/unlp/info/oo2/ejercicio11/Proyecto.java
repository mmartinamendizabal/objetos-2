package ar.edu.unlp.info.oo2.ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private int cantIntegrantes;
	private double margen;
	private double cobroPorDia;
	private State estado;
	
	public Proyecto (String nombre, LocalDate fechaInicio, LocalDate fechaFin, String objetivo, int cantIntegrantes, double cobroPorDia) {
		this.nombre=nombre;
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
		this.objetivo=objetivo;
		this.cantIntegrantes=cantIntegrantes;
		this.margen=7;
		this.cobroPorDia=cobroPorDia;
		this.estado= new EnConstruccion(this);
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public void setMargen(double margen) {
		this.margen = margen;
	}

	public void setEstado(State estado) {
		this.estado = estado;
	}
	
	public String getEstado() {
		return this.estado.toString();
	}
	
	public double precioDelProyecto() {
		return this.costoDelProyecto() + (this.costoDelProyecto() * this.margen / 100);
	}
	
	public double costoDelProyecto() {
		return this.cantIntegrantes * this.cobroPorDia * ChronoUnit.DAYS.between(this.fechaInicio, this.fechaFin);
	}
	
	public void aprobarEtapa() {
		this.estado.aprobarEtapa();
	}
	
	public double modificarMargen(double nuevoMargen) {
		this.estado.modificarMargen(nuevoMargen);
		return this.margen;
	}
	
	
	

}
