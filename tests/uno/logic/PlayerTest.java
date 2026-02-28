package uno.logic;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import logic.Game;
import logic.gameobjects.EasyPlayer;
import logic.gameobjects.Player;



/**
 * Esta clase representa el test de la clase pLayer.
 * Comprueba las funcionalidades básicas de dicha clase como lo son el throwCard, drawCards.
 */


public class PlayerTest {
		
		@Test
		void test(){
			Game game = Game.getInstance();
			
			try {
				game.loadAvailables();
				game.load(4);

			} catch (IOException e) {
				e.printStackTrace();
			}
			Player p = game.getCurrentPlayer();
					
			
			assertEquals(p.getCards().size(), 25);

			p.throwCard(p.getCards().get(0));
			assertEquals(p.getCards().size(), 24);
			p.drawCards(game, 1);
			assertEquals(p.getCards().size(), 25);
			assertTrue(!p.win());
			
			
		
		}
		
}


