package ar.edu.unlp.info.oo2.ejercicio15;

public class Permissions extends Aspect {

	public Permissions(FileOO2 file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "Permissions - " + this.getPermissions()+"\n";
	}

}
