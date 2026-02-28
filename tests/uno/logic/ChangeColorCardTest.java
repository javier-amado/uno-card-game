
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
import logic.gameobjects.ChangeCard;
import logic.gameobjects.ChangeColorCard;
import logic.gameobjects.ColorUNO;
import logic.gameobjects.HardPlayer;
import logic.gameobjects.Player;
import logic.gameobjects.PlayerList;
import logic.gameobjects.PlayerStrategy;
import logic.gameobjects.SimpleCard;


/**
 * Esta clase representa el test de las cartas del tipo ChangeColorCard.
 * Comprueba las funcionalidades básicas de dicha clase como lo son el execute del mismo(asigna un color a la carta)
 */


public class ChangeColorCardTest {
	
	@Test
	void test1(){
			
			
		 Game game = Game.getInstance();
			try {
				game.loadAvailables();
				game.load(1);
			} catch (IOException e) {
				
			}
			HardPlayer strategy = new HardPlayer();
			Card c = strategy.play(game);

			//changing color
			
			
			
			assertTrue(c.getColor()!=null);
			
			
	}
}
			
			
		


