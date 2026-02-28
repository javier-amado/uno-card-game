package uno.logic;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import controls.exceptions.GameException;
import logic.Game;
import logic.gameobjects.Card;
import logic.gameobjects.CardList;
import logic.gameobjects.ColorUNO;
import logic.gameobjects.EasyPlayer;
import logic.gameobjects.HardPlayer;
import logic.gameobjects.SimpleCard;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Esta clase representa el test de la estrategia del tipo HardPlayer.
 * Comprueba que en cada una de las 4 partidas(uno por test) que se cargan la elección qué carta tirar es 
 * la adecuada según marca la situación
 */

public class HardPlayerTest {

	@Test
	public void test0() {			
			 Game game = Game.getInstance();
//				List<String> nameList = new ArrayList<String>();
//				nameList.add("a");
//				nameList.add("b");
//				
//				List<String> typeList = new ArrayList<String>();
//				typeList.add("Easy");
//				typeList.add("Easy");
//
//			game.initialize(nameList, typeList);
//			
			try {
//			game.save("easyPlayerTest1");
				game.loadAvailables();
				game.load(0);
			} catch (IOException e) {
				
			}
			HardPlayer strategy = new HardPlayer();
			Card c = strategy.play(game);
			assertEquals(c.getSymbol(), "+4+");
		
		
	}
	@Test
	public void test1() {			
			 Game game = Game.getInstance();
			try {
				game.loadAvailables();
				game.load(1);
			} catch (IOException e) {
				
			}
			HardPlayer strategy = new HardPlayer();
			Card c = strategy.play(game);
			assertEquals(c.getSymbol(), "C");

		
		
	}
	@Test
	public void test2() {			
			 Game game = Game.getInstance();
			try {
				game.loadAvailables();
				game.load(2);
			} catch (IOException e) {
				
			}
			HardPlayer strategy = new HardPlayer();
			Card c = strategy.play(game);
			assertEquals(c.getSymbol(), "+4+");
		
		
	}
	@Test
	public void test3() {			
			 Game game = Game.getInstance();
			try {
				game.loadAvailables();
				game.load(3);
			} catch (IOException e) {
				
			}
			HardPlayer strategy = new HardPlayer();
			Card c = strategy.play(game);
			assertEquals(c.getSymbol(), "+2+");
			
		
		
	}
	
	
}
