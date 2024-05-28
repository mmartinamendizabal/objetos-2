package ar.edu.unlp.info.oo2.ejercicio15;

import java.time.LocalDate;

public interface FileOO2 {
	public String prettyPrint();
	public String getName();
	public String getExtention();
	public int getSize();
	public LocalDate getCreation();
	public LocalDate getModification();
	public String getPermissions();


}
