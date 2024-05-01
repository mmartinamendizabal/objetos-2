package ar.edu.unlp.info.oo2.ejercicio13;

import java.util.*;

public class Decodificador {
	private List <Pelicula> grilla;
	private List <Pelicula> reproducidas;
	private Sugerencia criterioSugerencia;
	
	public Decodificador() {
		this.grilla = new ArrayList<>();
		this.reproducidas = new ArrayList<>();
		this.criterioSugerencia = new SugerenciaNovedad();
	}
	
	public void agregarAGrilla(Pelicula pelicula) {
		this.grilla.add(pelicula);
	}
	public void agregarAReproducidas(Pelicula pelicula) {
		this.reproducidas.add(pelicula);
	}
	
	public void setCriterioSugerencia(Sugerencia criterio) {
		this.criterioSugerencia = criterio;
	}
	public List<Pelicula> obtenerSugerencias(){
		return this.criterioSugerencia.obtenerSugerencias(this);
	}
	
	public List<Pelicula> getReproducidas(){
		return this.reproducidas;
	}
	public List<Pelicula> getGrilla(){
		return this.grilla;
	}

}
