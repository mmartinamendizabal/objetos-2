package ar.edu.unlp.info.oo2.ejercicio07;

public class Archivo extends Elemento{
	
	public Archivo (String nombre) {
		super (nombre);
		this.setBytes(0);
	}
	

	@Override
	public int getTamano() {
		return this.getBytes();
	}


	@Override
	public Archivo getMasGrande() {
		return this;
	}


	@Override
	public Archivo getMasReciente() {
		return this;
	}
	
	protected boolean buscar(String nombre) {
		return this.getNombre().equals(nombre);
	}
	
	@Override
	public String toString() {
		return this.getNombre();
	}

}
