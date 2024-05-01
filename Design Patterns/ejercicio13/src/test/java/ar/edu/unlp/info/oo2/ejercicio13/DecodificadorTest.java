package ar.edu.unlp.info.oo2.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Year;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecodificadorTest {
	Decodificador decoder;
	List<Pelicula> listToCompare1;
	List<Pelicula> listToCompare2;
	
	@BeforeEach
	void setUp() {
	listToCompare1 = new ArrayList<>();
	listToCompare2 = new ArrayList<>();
	decoder = new Decodificador();
	Pelicula thor = new Pelicula("Thor", Year.of(2007), 7.9);
	decoder.agregarAGrilla(thor);
	decoder.agregarAReproducidas(thor);
    Pelicula capitanAmerica = new Pelicula("Capitan America", Year.of(2016), 7.8);
    decoder.agregarAGrilla(capitanAmerica);
    Pelicula ironMan = new Pelicula("Iron Man", Year.of(2010), 7.9);
    decoder.agregarAGrilla(ironMan);
    Pelicula dunkirk = new Pelicula("Dunkirk", Year.of(2017), 7.9);
    decoder.agregarAGrilla(dunkirk);
    Pelicula rocky = new Pelicula("Rocky", Year.of(1976), 8.1);
    decoder.agregarAGrilla(rocky);
    decoder.agregarAReproducidas(rocky);
    Pelicula rambo = new Pelicula("Rambo", Year.of(1979), 7.8);
    decoder.agregarAGrilla(rambo);
    thor.establecerSimilitud(capitanAmerica);
    thor.establecerSimilitud(ironMan);
    capitanAmerica.establecerSimilitud(ironMan);
    rocky.establecerSimilitud(rambo);
    listToCompare1.add(capitanAmerica);
    listToCompare1.add(ironMan);
    listToCompare1.add(rambo);
    listToCompare2.add(ironMan);
    listToCompare2.add(dunkirk);
    listToCompare2.add(capitanAmerica);
	}
    
	@Test
	void testSugerenciaPorSimilaridad() {
		
		decoder.setCriterioSugerencia(new SugerenciaSimilaridad());
		assertEquals(listToCompare1, decoder.obtenerSugerencias());
	}
	
	@Test
	void testSugerenciaPorPuntaje() {
		decoder.setCriterioSugerencia(new SugerenciaPuntaje());
		assertEquals(listToCompare2, decoder.obtenerSugerencias());
	}

}
