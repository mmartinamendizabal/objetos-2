package ar.edu.unlp.info.oo2.ejercicio06;

import java.util.*;

public class Mixta extends Topografia{
	private List<Topografia> componentes;
	
	public Mixta(Topografia uno, Topografia dos, Topografia tres, Topografia cuatro) {
		this.componentes=new ArrayList<>();
		this.componentes.add(uno);
		this.componentes.add(dos);
		this.componentes.add(tres);
		this.componentes.add(cuatro);
	}
	
	public List<Topografia> getComponentes(){
		return this.componentes;
	}
	@Override
	public double proporcionAgua() {
		return (this.componentes.stream()
				.mapToDouble(comp -> comp.proporcionAgua()).sum())/4;
	}
	

	@Override
	public boolean esIgual(Agua agua) {
		return false;
	}

	@Override
	public boolean esIgual(Tierra tierra) {
		return false;
	}

	@Override
	public boolean esIgual(Mixta mixta) {
		return this.componentes.stream()
			.allMatch(comp->comp.esIgual(this.getComponenteParaComparar(mixta, comp)));

	}
	
	private Topografia getComponenteParaComparar (Mixta mixta, Topografia comp) {
		return mixta.getComponentes().get(this.getComponentes().indexOf(comp));
	}

	@Override
	public boolean esIgual(Topografia t) {
		return t.esIgual(this);
	}
	




}
