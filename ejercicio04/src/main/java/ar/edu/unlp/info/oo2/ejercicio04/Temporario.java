package ar.edu.unlp.info.oo2.ejercicio04;

public class Temporario extends EmpleadoNoPasante{
	private int horasTrabajadas;
	
	public Temporario (boolean casado, int cantHijos, int horasTrabajadas) {
		super(casado, cantHijos);
		this.horasTrabajadas=horasTrabajadas;
	}

	@Override
	protected double basico() {
		return 20000 + this.horasTrabajadas*300;
	}
	
}
