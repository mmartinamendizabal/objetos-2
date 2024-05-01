package ar.edu.unlp.info.oo2.ejercicio13;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaPuntaje extends Sugerencia{

	@Override
	public List<Pelicula> sugerirPeliculas(Decodificador decoder) {
		return decoder.getGrilla().stream()
				.sorted((p1, p2)-> Double.compare(p2.getPuntaje(), p1.getPuntaje()))
				.collect(Collectors.toList());
	}
	


}
