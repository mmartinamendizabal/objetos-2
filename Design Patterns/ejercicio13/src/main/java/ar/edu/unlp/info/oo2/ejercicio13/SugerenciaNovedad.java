package ar.edu.unlp.info.oo2.ejercicio13;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaNovedad extends Sugerencia{

	@Override
	public List<Pelicula> sugerirPeliculas(Decodificador decoder) {
		return decoder.getGrilla().stream()
				.sorted((p1, p2) -> p1.getEstreno().compareTo(p2.getEstreno()))
				.collect(Collectors.toList());
	}

}
