package ar.edu.unlp.info.oo2.ejercicio05;

public class VideoFile extends Media{
	private String content = "Reproduciendo videofile";
	
	public void play() {
		System.out.print(this.content);
	}
}