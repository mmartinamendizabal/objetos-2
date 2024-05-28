package ar.edu.unlp.info.oo2.ejercicio22_SubteWay;

public class Sandwich {
	private double pan;
	private double aderezo;
	private double ingredientePrincipal;
	private double adicional;
	
	public void setPan(double pan) {
		this.pan = pan;
	}
	public void setAderezo(double aderezo) {
		this.aderezo = aderezo;
	}
	public void setIngredientePrincipal(double ingredientePrincipal) {
		this.ingredientePrincipal = ingredientePrincipal;
	}
	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public double getPrecio() {
		return this.pan +
				this.aderezo +
				this.ingredientePrincipal +
				this.adicional;
	}

}
