package ar.edu.unlp.info.oo2.ejercicio14;

import java.util.Collection;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess{
	private boolean sessionOpened;
	private String password;
	private DatabaseRealAccess database;
	
	public DatabaseAccessProxy(DatabaseRealAccess database) {
		this.sessionOpened=false;
		this.database=database;
		this.password="4gTyde670@j";
	}
	
	public boolean logIn(String password) {
		this.sessionOpened=this.password.equals(password);
		return this.sessionOpened;
	}
	
	public void logOut() {
		this.sessionOpened=false;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.sessionOpened) {
			return this.database.insertNewRow(rowData);
		}
		else throw new RuntimeException("You have to log in to do this operation.");
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (this.sessionOpened) {
			return this.database.getSearchResults(queryString);
		}
		else throw new RuntimeException("You have to log in to do this operation.");
	}

}
