package ar.edu.unlp.info.oo2.ejercicio04;

public class Planta extends EmpleadoNoPasante{
	private int antiguedad;
	
	public Planta (boolean casado, int cantHijos, int antiguedad) {
		super(casado, cantHijos);
		this.antiguedad=antiguedad;
	}
	
	protected double basico() {
		return 50000;
	}
	
	protected double adicional() {
		return super.adicional() + 2000*this.antiguedad;
	}
}
