package ar.edu.unlp.info.oo2.ejercicio05;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class MediaPlayer {
	private List<Media> media;
	
	public MediaPlayer() {
		this.media = new ArrayList<>();
		media.add(new Audio());
		media.add(new VideoFile());
		media.add(new VideoStreamAdapter());
	}
	
	public void play() {
		this.media.get((int)(Math.random()* this.media.size())).play();
	}
}
