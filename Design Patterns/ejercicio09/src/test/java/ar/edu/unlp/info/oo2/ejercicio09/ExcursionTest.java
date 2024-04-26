package ar.edu.unlp.info.oo2.ejercicio09;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	LocalDate fechaInicio = LocalDate.of(2024, 4, 20);
    LocalDate fechaFin = LocalDate.of(2024, 4, 22);
    Excursion excursion;
	
	
	@BeforeEach
	void setUp() {
		// Crear algunos usuarios
        Usuario usuario1 = new Usuario("Juan", "Perez", "juan@example.com");
        Usuario usuario2 = new Usuario("María", "González", "maria@example.com");

        // Crear una excursión
        excursion = new Excursion("Excursión A", fechaInicio, fechaFin, "Punto de encuentro A", 50.0, 3, 4);

        // Inscribir usuarios a la excursión
        excursion.inscribir(usuario1);
        excursion.inscribir(usuario2);
	}

    //@Test
    public void testDarInformacionProvisoria() {
        // Imprimir la información de la excursión
        System.out.println(excursion.obtenerInformacion());
    }
    
    //@Test
    public void testDatInformacionDefinitiva() {
        Usuario usuario3 = new Usuario("Carlos", "López", "carlos@example.com");
        Usuario usuario4 = new Usuario("Ana", "Martinez", "ana@example.com");
        excursion.inscribir(usuario3);
        excursion.inscribir(usuario4);
        System.out.println(excursion.obtenerInformacion());
    }
    @Test
    public void testDarInformacionEnEspera() {
    	Usuario usuario3 = new Usuario("Carlos", "López", "carlos@example.com");
        Usuario usuario4 = new Usuario("Ana", "Martinez", "ana@example.com");
        excursion.inscribir(usuario3);
        excursion.inscribir(usuario4);
    	Usuario usuario5 = new Usuario("Pedro", "Rodriguez", "pedro@example.com");
    	excursion.inscribir(usuario5);
    	System.out.println(excursion.obtenerInformacion());
    }
}
