package ar.edu.unlp.info.oo2.ejercicio09;

import java.util.*;

public class EnEspera extends State{
	private List<Usuario> listaDeEspera;

	public EnEspera(Excursion excursion) {
		super(excursion);
		this.listaDeEspera=new ArrayList<>();
	}
	
	@Override
	public void inscribir(Usuario unUsuario) {
		this.listaDeEspera.add(unUsuario);
	}
	
	public List<Usuario> getListaDeEspera(){
		return this.listaDeEspera;
	}



}
