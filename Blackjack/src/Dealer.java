
public class Dealer extends Player {
	
	
	public String status(){
		String status = this.getHand().getHand().pop().toString();
		return status;
	}
	
	private String fullStatus(){
		String status = "";
		for(Card card : hand.getHand()){
			status += card.toString() + "\n";
		}
		status += "Current score: " + hand.calculateScore();
		return status;
	}
	
	@Override 
	public void turn(){
		System.out.println(this.fullStatus());
		if(hand.calculateScore() < 17){
			this.hit();
			this.turn();
		} else {
			System.out.println("Dealer stands");
		}
	}
}
