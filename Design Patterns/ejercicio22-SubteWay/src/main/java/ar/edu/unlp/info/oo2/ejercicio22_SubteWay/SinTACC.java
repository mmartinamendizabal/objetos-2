package ar.edu.unlp.info.oo2.ejercicio22_SubteWay;

public class SinTACC extends SandwichMaker {

	@Override
	public void agregarPan() {
		this.getSandwich().setPan(150);
		
	}

	@Override
	public void agregarAderezo() {
		this.getSandwich().setAderezo(18);
		
	}

	@Override
	public void agregarIngredientePrincipal() {
		this.getSandwich().setIngredientePrincipal(250);
		
	}

	@Override
	public void agregarAdicional() {
		this.getSandwich().setAdicional(200);
		
	}

}
