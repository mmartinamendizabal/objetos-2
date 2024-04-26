package ar.edu.unlp.info.oo2.ejercicio1_oo2;

import java.util.*;

public class Twitter {
	private List<Usuario> users;
	
	public Twitter() {
		this.users=new ArrayList<>();
	}
	
	private boolean screenNameExists(String screenName) {
		return users.stream()   
			 .anyMatch(user->user.getScreenName().equals(screenName));
	}
	
	public Usuario createUser(String screenName) {
		if (!screenNameExists(screenName)) {
			Usuario newUser=new Usuario (screenName);
			this.users.add(newUser);
			return newUser;
		}else {
			System.out.println("El nombre de usuario ya existe, por favor elija uno diferente");
		}return null;
	}
	
	public void deleteUser(Usuario user) {
		this.users.stream()
			.forEach(u->u.deleteTweets(user.getTweets()));
		this.users.remove(user);
	}

}
