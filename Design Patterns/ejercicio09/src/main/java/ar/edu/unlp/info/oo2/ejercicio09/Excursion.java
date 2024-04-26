package ar.edu.unlp.info.oo2.ejercicio09;

import java.time.LocalDate;
import java.util.*;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoDeEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private State estado;
	private List<Usuario> inscriptos;
	
	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public String getPuntoDeEncuentro() {
		return puntoDeEncuentro;
	}

	public double getCosto() {
		return costo;
	}

	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoDeEncuentro, double costo, int cupoMin, int cupoMax) {
		this.nombre=nombre;
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
		this.puntoDeEncuentro=puntoDeEncuentro;
		this.costo=costo;
		this.cupoMinimo=cupoMin;
		this.cupoMaximo=cupoMax;
		this.estado=new Provisoria(this);
		this.inscriptos=new ArrayList<>();
	}
	
	public void setEstado(State estado) {
		this.estado=estado;
	}
	
	public List<Usuario> getInscriptos(){
		return this.inscriptos;
	}
	
	public State getEstado() {
		return estado;
	}

	public void inscribir(Usuario unUsuario) {
		this.estado.inscribir(unUsuario);
	}
	
	public String obtenerInformacion() {
		return this.estado.darInformacion();
	}
	
	public boolean alcanzoElMinimo() {
		return (this.faltanHastaCupoMin() == 0);
	}
	
	public boolean alcanzoElMaximo() {
		return (this.faltanHastaCupoMax() == 0);
	}
	
	public int faltanHastaCupoMin() {
		return this.cupoMinimo-this.inscriptos.size();
	}
	
	public int faltanHastaCupoMax() {
		return this.cupoMaximo-this.inscriptos.size();
	}

}
