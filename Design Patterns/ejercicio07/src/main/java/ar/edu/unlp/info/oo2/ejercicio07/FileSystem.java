package ar.edu.unlp.info.oo2.ejercicio07;

import java.util.*;

public class FileSystem {
	private Directorio raiz;
	/**
* Retorna el espacio total ocupado, incluyendo todo su contenido.
*/
	public FileSystem() {
		this.raiz= new Directorio("");
		this.raiz.agregarElemento(new Directorio("DirA"));
		this.raiz.agregarElemento( new Archivo("x"));
		Directorio dirb = new Directorio("DirB");
		dirb.agregarElemento(new Archivo ("xx"));
		dirb.agregarElemento(new Directorio ("DirC"));
		this.raiz.agregarElemento(dirb);
	}
       public int tamanoTotalOcupado() {
    	   return this.raiz.getTamano();
       }

    	/**
* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
* filesystem 
*/
       public Archivo archivoMasGrande() {
    	   return this.raiz.getMasGrande();
       }

	/**
* Retorna el archivo con fecha de creación más reciente en cualquier nivel 
* del filesystem
*/
       public Archivo archivoMasNuevo() {
    	   return this.raiz.getMasReciente();
       }

/**
* Retorna el primer elemento con el nombre solicitado contenido en cualquier
* nivel del filesystem
*/
       public Elemento buscar(String nombre){
    	   return this.raiz.buscarPrimero(nombre);
       }

/**
* Retorna la lista con los elementos que coinciden con el nombre solicitado 
* contenido en cualquier nivel del filesystem
*/
       public List<Elemento> buscarTodos(String nombre){
    	   return this.raiz.buscarTodos(nombre);
       };

/**
* Retorna un String con los nombres de los elementos contenidos en todos los 
* niveles del filesystem. De cada elemento debe retornar el path completo
* (similar al comando pwd de linux) siguiendo el modelo presentado a
* continuación
/Directorio A
/Directorio A/Directorio A.1
/Directorio A/Directorio A.1/Directorio A.1.1
/Directorio A/Directorio A.1/Directorio A.1.2 	
/Directorio A/Directorio A.2
/Directorio B
*/
       public String listadoDeContenido() {
    	   return this.raiz.toString();
       };
       //Redefinir toString() en las clases Archivo y Directorio
}
