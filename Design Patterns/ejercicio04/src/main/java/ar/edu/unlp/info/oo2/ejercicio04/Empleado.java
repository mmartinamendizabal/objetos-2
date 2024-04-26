package ar.edu.unlp.info.oo2.ejercicio04;

public abstract class Empleado {
	protected abstract double basico();
	protected abstract double adicional();
	
	private double descuentoBasico() {
		return this.basico()*0.13;
	}
	private double descuentoAdicional() {
		return this.adicional()*0.05;
	}
	private double descuento() {
		return this.descuentoBasico() + this.descuentoAdicional();
	}
	public double sueldo() {
		return this.basico() + this.adicional() - this.descuento();
	}
}
