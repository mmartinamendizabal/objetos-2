package ar.edu.unlp.info.oo2.ejercicio13;

import java.util.*;
import java.util.stream.Collectors;

public abstract class Sugerencia {
	
	public abstract List<Pelicula> sugerirPeliculas(Decodificador decoder);
	
	public List<Pelicula> obtenerSugerencias(Decodificador decoder) {
		return this.sugerirPeliculas(decoder).stream()
				.filter(pelicula -> !decoder.getReproducidas().contains(pelicula))
				.limit(3).collect(Collectors.toList());
	}

}
