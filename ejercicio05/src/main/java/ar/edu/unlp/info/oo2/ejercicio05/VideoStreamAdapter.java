package ar.edu.unlp.info.oo2.ejercicio05;

public class VideoStreamAdapter extends Media{
	private VideoStream vs = new VideoStream();

	public void play() {
		this.vs.reproduce();	
	}

}
