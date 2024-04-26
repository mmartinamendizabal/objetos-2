package ar.edu.unlp.info.oo2.ejercicio1_oo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TextTweetTest {

	Tweet tw1;
	
	@BeforeEach
	void setUp() {
		tw1= new TextTweet("Hola!");
	}
	@Test
	public void testText() {
		assertEquals("Hola!",tw1.getText());
	}
	@Test
	public void testRetweet() {
		assertEquals(tw1,tw1.getTw());
	}

}
