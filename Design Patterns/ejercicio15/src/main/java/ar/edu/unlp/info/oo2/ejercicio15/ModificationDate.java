package ar.edu.unlp.info.oo2.ejercicio15;

public class ModificationDate extends Aspect {

	public ModificationDate(FileOO2 file) {
		super(file);
	}
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "Modification date - " + this.getModification()+"\n";
	}
}
