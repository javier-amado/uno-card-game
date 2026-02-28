package uno.logic;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
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
import logic.gameobjects.Add2Card;
import logic.gameobjects.Add4Card;
import logic.gameobjects.Card;
import logic.gameobjects.ChangeCard;
import logic.gameobjects.ColorUNO;
import logic.gameobjects.HardPlayer;
import logic.gameobjects.Player;
import logic.gameobjects.PlayerList;
import logic.gameobjects.PlayerStrategy;



/**
 * Esta clase representa el test de las cartas del tipo ChangeCard.
 * Comprueba las funcionalidades básicas de dicha clase como lo son el execute del mismo( verifica que cambia el sentido de cambio de jugadores)
 *  o el toString
 */





public class ChangeCardTest {
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
			
			ChangeCard card1 = new ChangeCard(ColorUNO.YELLOW);
			
			
			
			assertEquals(card1.toString(), c.toString());
	}
		
}


