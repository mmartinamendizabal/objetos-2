package ar.edu.unlp.info.oo2.ejercicio15;

import java.time.LocalDate;

public class Aspect implements FileOO2{
	private FileOO2 file;
	
	public Aspect(FileOO2 file) {
		super();
		this.file = file;
	}

	public FileOO2 getFile() {
		return this.file;
	}

	@Override
	public String prettyPrint() {
		return this.getFile().prettyPrint();
	}

	@Override
	public String getName() {
		return this.file.getName();
	}

	@Override
	public String getExtention() {
		return this.file.getExtention();
	}

	@Override
	public int getSize() {
		return this.file.getSize();
	}

	@Override
	public LocalDate getCreation() {
		return this.file.getCreation();
	}

	@Override
	public LocalDate getModification() {
		return this.file.getModification();
	}

	@Override
	public String getPermissions() {
		return this.file.getPermissions();
	}

}
