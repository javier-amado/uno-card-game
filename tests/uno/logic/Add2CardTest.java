package uno.logic;


import org.json.JSONObject;
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
import logic.gameobjects.Add2Card;
import logic.gameobjects.Card;
import logic.gameobjects.ColorUNO;
import logic.gameobjects.HardPlayer;
import logic.gameobjects.PlayerList;
import logic.gameobjects.PlayerStrategy;







/**
 * Esta clase representa el test de las cartas del tipo Add2Card.
 * Comprueba las funcionalidades básicas de dicha clase como lo son el execute del mismo( verifica que el siguiente jugador coje 2 cartas)
 *  o el toString
 */


public class Add2CardTest {
	@Test
	void test(){
			

		 Game game = Game.getInstance();
			try {
				game.loadAvailables();
				game.load(3);
			} catch (IOException e) {
				
			}
			HardPlayer strategy = new HardPlayer();
			Card c = strategy.play(game);

			int size = game.nextPlayer().getCards().size();
			
			c.execute(game);
			
			assertEquals(game.nextPlayer().getCards().size(), size+2);
			
			Add2Card card1 = new Add2Card(ColorUNO.RED);
			
			
			
			assertEquals(card1.toString(), c.toString());
			
	}
	
	
}
