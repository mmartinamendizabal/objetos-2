package ar.edu.unlp.info.oo2.ejercicio07;

import java.time.LocalDate;


public abstract class Elemento {
	private String nombre;
	private LocalDate fechaCreacion;
	private int bytes;
	
	public Elemento (String nombre) {
		this.nombre = nombre;
		this.fechaCreacion = LocalDate.now();
	}
	protected int getBytes() {
		return this.bytes;
	}
	protected void setBytes(int bytes) {
		this.bytes = bytes;
	}
	
	protected String getNombre() {
		return this.nombre;
	}
	
	protected LocalDate getFecha() {
		return this.fechaCreacion;
	}
	
	public abstract String toString();
	protected abstract boolean buscar(String nombre);
	public abstract int getTamano();
	public abstract Archivo getMasGrande();
	public abstract Archivo getMasReciente();
	
	
}
