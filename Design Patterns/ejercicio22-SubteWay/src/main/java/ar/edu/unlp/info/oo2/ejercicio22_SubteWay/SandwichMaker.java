package ar.edu.unlp.info.oo2.ejercicio22_SubteWay;

public abstract class SandwichMaker {
	private Sandwich sandwich;
	
	public void reset() {
		this.sandwich = new Sandwich();
	}
	public abstract void agregarPan();
	public abstract void agregarAderezo();
	public abstract void agregarIngredientePrincipal();
	public abstract void agregarAdicional();
	
	public Sandwich getSandwich() {
		return this.sandwich;
	}
}
