package ar.edu.unlp.info.oo2.ejercicio15;

public class Name extends Aspect {

	public Name(FileOO2 file) {
		super(file);
	}
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "Name - " + this.getName()+"\n";
	}
}
