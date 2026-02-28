package uno.logic;

import java.util.ArrayList;
import java.util.List;

import logic.Game;
import logic.gameobjects.Add4Card;
import logic.gameobjects.Card;
import logic.gameobjects.CardList;
import logic.gameobjects.PlayerList;
import logic.gameobjects.SimpleCard;

import org.json.JSONObject;
import org.json.JSONArray;
import org.junit.jupiter.api.Test;

import controls.exceptions.GameException;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import logic.Game;
import logic.gameobjects.Add2Card;
import logic.gameobjects.Add4Card;
import logic.gameobjects.ColorUNO;
import logic.gameobjects.PlayerList;


/**
 * Esta clase representa el test de las listas del tipo CardList.
 * Comprueba las funcionalidades básicas de dicha clase como lo son el add, remove, clear, posible y report
 */

public class CardListTest {
	@Test
	void test0(){
		CardList list = new CardList();
		SimpleCard card1 = new SimpleCard("1", ColorUNO.BLUE);
		SimpleCard card2 = new SimpleCard("2", ColorUNO.RED);
		SimpleCard card3 = new SimpleCard("3", ColorUNO.YELLOW);
		SimpleCard card4 = new SimpleCard("4", ColorUNO.GREEN);

		
		list.add(card1);
		assertEquals(list.get(0).toString(), card1.toString());
		list.add(card2);
		assertEquals(list.get(1).toString(), card2.toString());
		list.add(card3);
		assertEquals(list.get(2).toString(), card3.toString());
		list.add(card4);
		assertEquals(list.get(3).toString(), card4.toString());
		list.add(card1);
		assertEquals(list.get(4).toString(), card1.toString());
		list.add(card2);
		assertEquals(list.get(5).toString(), card2.toString());
		list.add(card3);
		assertEquals(list.get(6).toString(), card3.toString());

		
		list.remove(card4);
//		assertEquals(list.get(6), null);
		
		list.remove(2);
		assertEquals(list.get(2).toString(), card1.toString());
			
		
		
//		CardList list2 = list;
//		list.shuffle(game);
//		assertTrue(!list.equals(list2));


		assertTrue(list.possible(card1));
		
	}
	@Test
	void test1(){
		CardList list1 = new CardList();
		CardList list = new CardList();

		SimpleCard card11 = new SimpleCard("1", ColorUNO.BLUE);
		SimpleCard card22 = new SimpleCard("2", ColorUNO.RED);
		SimpleCard card33 = new SimpleCard("3", ColorUNO.YELLOW);
		SimpleCard card44 = new SimpleCard("4", ColorUNO.GREEN);
		
		list.add(card11);
		list.add(card22);
		list.add(card33);
		list.add(card44);

		JSONObject result1 = new JSONObject(); 
		result1.put("type","SimpleCard");
		
		JSONObject interior1 = new JSONObject();
		interior1.put("symbol", "1");
		interior1.put("color", ColorUNO.BLUE.toString());						
		result1.put("data", interior1);	
		JSONObject result2 = new JSONObject(); 
		result2.put("type","SimpleCard");
		
		JSONObject interior2 = new JSONObject();
		interior2.put("symbol", "2");
		interior2.put("color", ColorUNO.RED.toString());						
		result2.put("data", interior2);	
		JSONObject result3 = new JSONObject(); 
		result3.put("type","SimpleCard");
		
		JSONObject interior3 = new JSONObject();
		interior3.put("symbol", "3");
		interior3.put("color", ColorUNO.YELLOW.toString());						
		result3.put("data", interior3);	
		JSONObject result4 = new JSONObject(); 
		result4.put("type","SimpleCard");
		
		JSONObject interior4 = new JSONObject();
		interior4.put("symbol", "4");
		interior4.put("color", ColorUNO.GREEN.toString());						
		result4.put("data", interior4);	
		
		JSONArray cards = new JSONArray();
		cards.put(result1);
		cards.put(result2);
		cards.put(result3);
		cards.put(result4);
		
		JSONArray list2= list.report();
		assertEquals(list2.get(0).toString(), cards.get(0).toString());
		assertEquals(list2.get(1).toString(), cards.get(1).toString());
		assertEquals(list2.get(2).toString(), cards.get(2).toString());
		assertEquals(list2.get(3).toString(), cards.get(3).toString());

		
		
		try {
			assertEquals(list.getCard("1", ColorUNO.BLUE).toString(),card11.toString());
		} catch (GameException e) {
			e.printStackTrace();
		}

		
		list.clear();
		assertTrue(list.size()==0);
		


	}
}
