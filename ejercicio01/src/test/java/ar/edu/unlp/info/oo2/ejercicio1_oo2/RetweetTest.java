package ar.edu.unlp.info.oo2.ejercicio1_oo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RetweetTest {
	Tweet tw1;
	Tweet tw2;
	
	@BeforeEach
	void setUp() {
		tw1= new TextTweet("Hola!");
		tw2= new Retweet(tw1);
	}
	@Test
	public void testText() {
		assertEquals("Hola!",tw2.getText());
	}
	@Test
	public void testRetweet() {
		assertEquals(tw1,tw2.getTw());
	}

}
