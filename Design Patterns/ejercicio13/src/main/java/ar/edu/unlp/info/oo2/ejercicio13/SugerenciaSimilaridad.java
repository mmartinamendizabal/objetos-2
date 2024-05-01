package ar.edu.unlp.info.oo2.ejercicio13;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaSimilaridad extends Sugerencia{

	@Override
	public List<Pelicula> sugerirPeliculas(Decodificador decoder) {
		return decoder.getReproducidas().stream()
				.map(pelicula -> pelicula.getPeliculasSimilares())
				.flatMap(simil -> simil.stream())
				.distinct().collect(Collectors.toList());
	}

}
