package uno.logic;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import controls.exceptions.GameException;
import logic.Game;
import logic.gameobjects.Add4Card;
import logic.gameobjects.Card;
import logic.gameobjects.CardList;
import logic.gameobjects.ColorUNO;
import logic.gameobjects.EasyPlayer;
import logic.gameobjects.MediumPlayer;
import logic.gameobjects.PlayerStrategy;
import logic.gameobjects.SimpleCard;
import storage.Storage;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Esta clase representa el test de la estrategia del tipo EasyPlayer.
 * Comprueba que en cada una de las 4 partidas(uno por test) que se cargan la elección qué carta tirar es 
 * la adecuada según marca la situación.
 */

public class EasyPlayerTest {

	
	@Test
	public void test0() {
		
		 Game game = Game.getInstance();
		try {
       	game.loadAvailables();
   		game.load(0);
		} catch (IOException e) {
			
		}
		EasyPlayer strategy = new EasyPlayer();
		Card c = strategy.play(game);
		SimpleCard red3 = new SimpleCard("8", ColorUNO.YELLOW);
		assertTrue(c.toString().equals(red3.toString()));
	}
	@Test
	public void test1() {
		
		 Game game = Game.getInstance();
		try {
       	game.loadAvailables();
   		game.load(1);
		} catch (IOException e) {
			
		}
		EasyPlayer strategy = new EasyPlayer();
		Card c = strategy.play(game);
		assertTrue(c.getSymbol().equals("C"));
	}
	@Test
	public void test2() {
	
		 Game game = Game.getInstance();
		try {
        	game.loadAvailables();
    		game.load(2);
		} catch (IOException e) {
			
		}
		EasyPlayer strategy = new EasyPlayer();
		Card c = strategy.play(game);
		SimpleCard red3 = new SimpleCard("0", ColorUNO.GREEN);
		assertTrue(c.toString().equals(red3.toString()));
	}
	@Test
	public void test3() {
		
		 Game game = Game.getInstance();		
		try {
       	game.loadAvailables();
   		game.load(3);
		} catch (IOException e) {
		}
		EasyPlayer strategy = new EasyPlayer();
		Card c = strategy.play(game);
		SimpleCard red3 = new SimpleCard("9", ColorUNO.RED);
		assertTrue(c.toString().equals(red3.toString()));
	}
}
