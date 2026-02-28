
package uno.logic;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import logic.Game;
import logic.factories.Builder;
import logic.factories.BuilderBasedFactory;
import logic.factories.EasyPlayerBuilder;
import logic.factories.HardPlayerBuilder;
import logic.factories.HumanPlayerBuilder;
import logic.factories.MediumPlayerBuilder;
import logic.gameobjects.Add4Card;
import logic.gameobjects.Card;
import logic.gameobjects.ChangeCard;
import logic.gameobjects.ColorUNO;
import logic.gameobjects.EasyPlayer;
import logic.gameobjects.Player;
import logic.gameobjects.PlayerList;
import logic.gameobjects.PlayerStrategy;




/**
 * Esta clase representa el test de las listas del tipo PlayerList.
 * Comprueba las funcionalidades básicas de dicha clase
 */
public class PlayerListTest {
	@Test
	void test(){		 
	
	 Game game = Game.getInstance();
		try {
			game.loadAvailables();
			game.load(4);
		} catch (IOException e) {
			
		}
		Card c = game.getPlayerCards().get(4);

		Player p = game.nextPlayer();
		
		c.execute(game);
		assertTrue(!game.nextPlayer().equals(p));
		
		assertTrue(game.getPlayerList().size()==3);
		
		
	}
	
}
