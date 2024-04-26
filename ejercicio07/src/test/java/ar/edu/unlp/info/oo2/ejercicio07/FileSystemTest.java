package ar.edu.unlp.info.oo2.ejercicio07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FileSystemTest {
	FileSystem fs=new FileSystem();

	@Test
	void test() {
		System.out.println(fs.listadoDeContenido());;
	}

}
