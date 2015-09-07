import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {
	Deck deck;
	
	@Before 
	public void setUp(){
		deck = new Deck();
	}
	
	@Test
	public void testDeck() {
		assertNotNull(deck);
	}
	
	@Test
	public void testGettingFromDeck(){
		Card card = deck.getDeck().pop();
		Card card2 = deck.getDeck().pop();
		
		assertNotNull(deck.getDeck().pop());
		System.out.println("Description " + card.getDescription() + " "+ card.getValue());
		System.out.println("Description " + card2.getDescription() + " "+ card2.getValue());
	}

}
