package ar.edu.unlp.info.oo2.ejercicio22_SubteWay;

public class Vegetariano extends SandwichMaker {

	@Override
	public void agregarPan() {
		this.getSandwich().setPan(120);
		
	}

	@Override
	public void agregarAderezo() {
		this.getSandwich().setAderezo(0);
		
	}

	@Override
	public void agregarIngredientePrincipal() {
		this.getSandwich().setIngredientePrincipal(200);
		
	}

	@Override
	public void agregarAdicional() {
		this.getSandwich().setAdicional(100);
		
	}

}
