package ar.edu.unlp.info.oo2.ejercicio15;

public class Extention extends Aspect {

	public Extention(FileOO2 file) {
		super(file);
	}
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "Extention - " + this.getExtention()+"\n";
	}

}
