package ar.edu.unlp.info.oo2.ejercicio15;

public class CreationDate extends Aspect {

	public CreationDate(FileOO2 file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "Creation date - " + this.getCreation()+"\n";
	}
}
