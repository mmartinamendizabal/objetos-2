package ar.edu.unlp.info.oo2.ejercicio22_SubteWay;

public class SubteWay {
	private SandwichMaker sandwichMaker;
	
	public SubteWay(SandwichMaker maker) {
		this.sandwichMaker = maker;
	}
	
	public void cambiarMaker(SandwichMaker maker) {
		this.sandwichMaker = maker;
	}
	
	public void hacerSandwich() {
		this.sandwichMaker.reset();
		this.sandwichMaker.agregarPan();
		this.sandwichMaker.agregarAderezo();
		this.sandwichMaker.agregarIngredientePrincipal();
		this.sandwichMaker.agregarAdicional();
	}

}
