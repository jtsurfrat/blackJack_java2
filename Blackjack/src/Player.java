import java.util.Scanner;

public class Player {
	protected Hand hand;
	
	public Player(){
		hand = new Hand();
	}
	
	
	public Card hit(){
		Card card = Deck.getDeck().pop();
		hand.addToHand(card);
		return card;

	}


	public Hand getHand() {
		return hand;
	}


	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
	
	public String status(){
		String status = "";
		for(Card card : hand.getHand()){
			status += card.toString() + "\n";
		}
		status += "Current score: " + hand.calculateScore();
		return status;
	}
	public void turn(){
		System.out.println(this.status());
		if(hand.calculateScore() <= 21){
			System.out.println("Do yo want another card?");
			Scanner sc = new Scanner(System.in);
			String answer = sc.next();
			if((answer.equals("Y")) ||(answer.equals("y"))){
				this.hit();
				this.turn();
			} else {
				System.out.print("Dealers turn. ");
			}
		} else {
			System.out.println("You lost, Loser!!!");
		}
		
	}

}
