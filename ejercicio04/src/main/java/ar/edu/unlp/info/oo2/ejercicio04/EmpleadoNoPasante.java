package ar.edu.unlp.info.oo2.ejercicio04;

public abstract class EmpleadoNoPasante extends Empleado{
	private boolean casado;
	private int cantHijos;
	
	public EmpleadoNoPasante(boolean casado, int cantHijos) {
		this.casado=casado;
		this.cantHijos=cantHijos;
	}
	
	protected double adicional() {
		double total=(2000*this.cantHijos);
		if (this.casado)
			return total + 5000;
		return total;
	}
	

}
