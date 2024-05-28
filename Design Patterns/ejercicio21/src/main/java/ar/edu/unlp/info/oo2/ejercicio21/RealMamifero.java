package ar.edu.unlp.info.oo2.ejercicio21;

import java.time.LocalDate;

public class RealMamifero implements Mamifero{
	private String id;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero madre;
	private Mamifero padre;
	
	public RealMamifero(String id) {
		this.id = id;
	}
	
	@Override
	public String getIdentificador() {
		return id;
	}
	@Override
	public void setIdentificador(String id) {
		this.id = id;
	}
	@Override
	public String getEspecie() {
		return especie;
	}
	@Override
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	@Override
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	@Override
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public Mamifero getMadre() {
		return madre;
	}
	@Override
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	@Override
	public Mamifero getPadre() {
		return padre;
	}
	@Override
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	@Override
	public Mamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}

	@Override
	public Mamifero getAbuelaMaterna() {
		return this.madre.getMadre();
	}

	@Override
	public Mamifero getAbueloPaterno() {
		return this.padre.getPadre();
	}

	@Override
	public Mamifero getAbuelaPaterna() {
		return this.padre.getMadre();
	}

	@Override
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		if (this.id.equals(unMamifero.getIdentificador()))
			return true;
		return this.madre.tieneComoAncestroA(unMamifero) || this.padre.tieneComoAncestroA(unMamifero);
	}

}
