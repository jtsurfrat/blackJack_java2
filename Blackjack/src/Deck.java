import java.net.Proxy.Type;
import java.util.Collections;
import java.util.Stack;

public class Deck {
	private static Stack<Card>deck;
	
	public Deck(){
		deck = new Stack<Card>();
		// ACES
		deck.push(new Card(Suit.CLUB, "A"));
		deck.push(new Card(Suit.DIAMOND, "A"));
		deck.push(new Card(Suit.HEART, "A"));
		deck.push(new Card(Suit.SPADE, "A"));
		//KINGS
		deck.push(new Card(Suit.CLUB, "K"));
		deck.push(new Card(Suit.DIAMOND, "K"));
		deck.push(new Card(Suit.HEART, "K"));
		deck.push(new Card(Suit.SPADE, "K"));
		//QUEENS
		deck.push(new Card(Suit.CLUB, "Q"));
		deck.push(new Card(Suit.DIAMOND, "Q"));
		deck.push(new Card(Suit.HEART, "Q"));
		deck.push(new Card(Suit.SPADE, "Q"));
		//JACKS
		deck.push(new Card(Suit.CLUB, "J"));
		deck.push(new Card(Suit.DIAMOND, "J"));
		deck.push(new Card(Suit.HEART, "J"));
		deck.push(new Card(Suit.SPADE, "J"));
		
		
		//Number Cards
		// ace = 1 or 11
		
		for(Suit suit: Suit.values()){
			for(int i = 2; i < 11; i++){
				deck.push(new Card(suit, Integer.toString(i)));
			}
		}
		this.shuffle();
	}

	private void shuffle() {
		Collections.shuffle(deck);	
	}

	public static Stack<Card> getDeck() {
		return deck;
	}

	public void setDeck(Stack<Card> deck) {
		Deck.deck = deck;
	}
	
	public static Card getCard(){
		return deck.pop();
	}

}