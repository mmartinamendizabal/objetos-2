package ar.edu.unlp.info.oo2.ejercicio04;

public class Pasante extends Empleado{
	private int cantExamenes;
	
	public Pasante (int cantExamenes) {
		this.cantExamenes=cantExamenes;
	}
	
	protected double basico() {
		return 20000;
	}
	protected double adicional() {
		return 2000 * this.cantExamenes;
	}
}
