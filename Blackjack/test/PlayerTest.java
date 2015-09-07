import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
	Deck deck;
	Player player1;
	
	@Before
	public void setUp(){
		deck = new Deck();
		player1 = new Player();
	}

	@Test
	public void testInstation() {
		assertNotNull(player1);
		assertNotNull(player1.getHand());
	}
	
	@Test
	public void testHit(){
		assertNotNull(player1.hit());
		assertEquals(1, player1.getHand().getHand().size());
		player1.hit();
		player1.hit();
		player1.hit();
		assertEquals(4, player1.getHand().getHand().size());
		assertNotEquals(0, player1.getHand().calculateScore());
		System.out.println(player1.getHand().calculateScore());
		}

}