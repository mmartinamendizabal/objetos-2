package ar.edu.unlp.info.oo2.ejercicio06;

public abstract class Topografia {
	
	public abstract double proporcionAgua();	
	public abstract boolean esIgual(Agua agua);
	public abstract boolean esIgual(Tierra tierra);
	public abstract boolean esIgual(Mixta mixta);
	public abstract boolean esIgual(Topografia t);
	
	public double proporcionTierra() {
		return 1-(this.proporcionAgua());
	}
}
