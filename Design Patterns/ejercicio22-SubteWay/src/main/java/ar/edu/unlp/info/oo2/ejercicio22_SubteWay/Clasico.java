package ar.edu.unlp.info.oo2.ejercicio22_SubteWay;

public class Clasico extends SandwichMaker {

	@Override
	public void agregarPan() {
		this.getSandwich().setPan(100);
		
	}

	@Override
	public void agregarAderezo() {
		this.getSandwich().setAderezo(20);
		
	}

	@Override
	public void agregarIngredientePrincipal() {
		this.getSandwich().setIngredientePrincipal(300);
		
	}

	@Override
	public void agregarAdicional() {
		this.getSandwich().setAdicional(80);
		
	}

}
