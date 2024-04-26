package ar.edu.unlp.info.oo2.ejercicio1_oo2;

public class Retweet implements Tweet{
	private Tweet origin;
	
	public Retweet(Tweet tw){
		this.origin=tw;
	}
	@Override
	public String getText() {
		return this.origin.getText();
	}

	@Override
	public Tweet getTw() {
		return this.origin;
	}
	
	
	
}
