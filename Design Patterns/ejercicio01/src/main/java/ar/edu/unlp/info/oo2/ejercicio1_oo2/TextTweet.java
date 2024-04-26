package ar.edu.unlp.info.oo2.ejercicio1_oo2;

public class TextTweet implements Tweet{
	private String text;
	
	public TextTweet(String text) {
		this.text=text;
	}
	@Override
	public String getText() {
		return this.text;
	}

	@Override
	public Tweet getTw() {
		return this;
	}
	
}
