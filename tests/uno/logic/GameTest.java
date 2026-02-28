package uno.logic;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import logic.Game;
import logic.gameobjects.Add2Card;
import logic.gameobjects.Add4Card;
import logic.gameobjects.Card;
import logic.gameobjects.CardList;
import logic.gameobjects.ChangeCard;
import logic.gameobjects.ColorUNO;
import logic.gameobjects.ForbiddenCard;
import logic.gameobjects.HardPlayer;
import logic.gameobjects.Player;
import logic.gameobjects.PlayerList;
import logic.gameobjects.SimpleCard;


/**
 * Esta clase representa el test de la clase Game, que tiene la lógica del juego.
 * Comprueba las principales funcionalidades del flujo del juego como son los métodos nestPlayer, isPossibleDraw, hasEnded
 * endGame, loadAvailables, load, además de hacer uso de ciertso getters de la misma clase
 */



public class GameTest {
	@Test
	void test() {
		 Game game = Game.getInstance();
			try {
				game.loadAvailables();
				game.load(4);
			} catch (IOException e) {
				
			}
			SimpleCard s = new SimpleCard("1", ColorUNO.RED);
			assertEquals(game.getCenterCard().toString(), s.toString());
			
			Player p = game.getCurrentPlayer();
			
			game.changeOrderPlayers();
			assertTrue(!game.nextPlayer().equals(p));
			
			assertTrue(game.isPossibleDraw());
			
			assertTrue(!game.hasEnded());
			
			game.endGame();;
			
			assertTrue(game.hasEnded());
	
	
	
	
	}
	
//	public static void main(String args[]){
//	 
//		Game game = Game.getInstance();
//		try {
//			game.loadAvailables();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("a");
//	}
//	
}
