package ar.edu.unlp.info.oo2.ejercicio15;

public class Size extends Aspect {

	public Size(FileOO2 file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "Size - " + this.getSize()+"\n";
	}

}
