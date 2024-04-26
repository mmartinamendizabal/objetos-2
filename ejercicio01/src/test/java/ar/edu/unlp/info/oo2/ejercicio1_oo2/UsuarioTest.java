package ar.edu.unlp.info.oo2.ejercicio1_oo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	
	Usuario pikachu;
	Usuario squirtle;
	Usuario charmander;
	Tweet tw1;
	Tweet tw2;
	Tweet tw3;
	Tweet tw4;
	
	@BeforeEach
	void setUp() {
		pikachu = new Usuario ("pikachu");
		squirtle = new Usuario ("squirtle");
		charmander = new Usuario ("charmander");
		tw1=pikachu.postTweet("Aguante pokémon");
		tw2=charmander.rtTweet(tw1);
		tw3=squirtle.postTweet("Vamo a calmarno");
		tw4=pikachu.rtTweet(tw2);
	}

	@Test
	void testReadTweet() {
		assertEquals("Vamo a calmarno", charmander.readTweet(tw3));
	}
	@Test
	void testMoreCharsThanAllowed() {
		assertNull(squirtle.postTweet("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));
	}
	@Test
	void testEmptyTweet() {
		assertNull(pikachu.postTweet(""));
	}
	@Test
	void testRetweet() {
		assertEquals(charmander.readTweet(tw1), charmander.readTweet(tw2));
	}
	@Test
	void testRtRetweet() {
		assertEquals(pikachu.readTweet(tw1), pikachu.readTweet(tw4));
	}

}
