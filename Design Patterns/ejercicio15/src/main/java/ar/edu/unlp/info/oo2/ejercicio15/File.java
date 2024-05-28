package ar.edu.unlp.info.oo2.ejercicio15;

import java.time.LocalDate;

public class File implements FileOO2{
	private String name;
	private String extention;
	private int size;
	private LocalDate creation;
	private LocalDate modification;
	private String permissions;

	public File(String name, String extention, int size, LocalDate creation, LocalDate modification,
			String permissions) {
		this.name = name;
		this.extention = extention;
		this.size = size;
		this.creation = creation;
		this.modification = modification;
		this.permissions = permissions;
	}

	public String getName() {
		return name;
	}

	public String getExtention() {
		return extention;
	}

	public int getSize() {
		return size;
	}

	public LocalDate getCreation() {
		return creation;
	}

	public LocalDate getModification() {
		return modification;
	}

	public String getPermissions() {
		return permissions;
	}

	@Override
	public String prettyPrint() {
		return "File: \n";
	}

}
