package ar.edu.unlp.info.oo2.ejercicio07;

import java.util.*;
import java.util.stream.Collectors;

public class Directorio extends Elemento{
	private List<Elemento> elementos;
	
	public Directorio (String nombre) {
		super(nombre);
		this.elementos = new ArrayList<>();
		this.setBytes(32000);
	}
	
	public List<Elemento> getElems(){
		return this.elementos;
	}
	public void agregarElemento(Elemento e) {
		this.elementos.add(e);
	}

	@Override
	public int getTamano() {
		return (this.elementos.stream()
				.mapToInt(elem -> elem.getTamano()).sum())
				+ this.getBytes();
	}

	@Override
	public Archivo getMasGrande() {
		return (Archivo) this.elementos.stream()
				.max((e1, e2)-> Integer.compare(
						e1.getMasGrande().getTamano(),e2.getMasGrande().getTamano()))
				.orElse(null);
	}

	@Override
	public Archivo getMasReciente() {
		return (Archivo) this.ordenar().stream()
				.limit(1);
	}
	
	private List<Elemento> ordenar(){
		return this.elementos.stream()
				.sorted((e1, e2) ->
				e2.getFecha().compareTo(e1.getFecha()))
						.collect(Collectors.toList());
	}
	
	protected boolean buscar(String nombre) {
		return this.elementos.stream()
				.anyMatch(elem -> elem.buscar(nombre));
	}
	public Elemento buscarPrimero(String nombre) {
		return this.elementos.stream()
			.filter(elem -> elem.buscar(nombre)).findFirst()
			.orElse(null);
	}
	
	public List<Elemento> buscarTodos(String nombre){
 	   return this.elementos.stream()
 			   .filter(elem -> elem.buscar(nombre))
 			   .collect(Collectors.toList());
    }

	@Override
	public String toString() {
		String str = this.getNombre()+
				this.elementos.stream()
				.map(elem->"/"+elem.toString())
				.collect(Collectors.joining());
		return str;
	};

}
