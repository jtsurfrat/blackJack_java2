import java.util.Stack;

public class Hand {
	private Stack<Card> hand;
	private int score = 0;
	
	public Hand(){
		hand = new Stack<Card>();
	}
	
	
	public Stack<Card> getHand() {
		return hand;
	}


	public void setHand(Stack<Card> hand) {
		this.hand = hand;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}

	
	public int calculateScore(){
		int sum = 0;
		for(Card card : hand){
			sum += card.getValue();
		}
		this.setScore(sum);
		return sum;
	}
	
	public void addToHand(Card card){
		hand.push(card);
		this.calculateScore();
	}

}
