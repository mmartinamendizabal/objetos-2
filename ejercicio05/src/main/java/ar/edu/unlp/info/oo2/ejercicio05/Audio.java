package ar.edu.unlp.info.oo2.ejercicio05;

public class Audio extends Media{
	private String content = "Reproduciendo audio";
	
	public void play() {
		System.out.print(this.content);
	}
}
