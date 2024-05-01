package ar.edu.unlp.info.oo2.ejercicio13;

import java.time.Year;
import java.util.*;

public class Pelicula {
	private String titulo;
	private Year estreno;
	private double puntaje;
	private List<Pelicula> peliculasSimilares;
	
	public Pelicula(String titulo, Year estreno, double puntaje) {
		this.titulo = titulo;
		this.estreno = estreno;
		this.puntaje = puntaje;
		this.peliculasSimilares = new ArrayList<>();
	}
	
	public void establecerSimilitud(Pelicula pelicula) {
		if (!this.peliculasSimilares.contains(pelicula)) {
			this.peliculasSimilares.add(pelicula);
			pelicula.establecerSimilitud(this);
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public Year getEstreno() {
		return estreno;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public List<Pelicula> getPeliculasSimilares() {
		return peliculasSimilares;
	}
}
