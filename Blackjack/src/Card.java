
public class Card {
	private Suit suit;
	private String description;
	private int value;

	// Constructors

	public Card(Suit suit, String description) {
		super();
		this.setSuit(suit);
		this.setDescription(description);

		if (description == "K" || description == "Q" || description == "J" || description == "A") {
			this.setValue(10);
		} else {
			this.setValue(Integer.parseInt(description));
		}

	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public String getDescription() {

		return description;

	}

	public void setDescription(String description) {
		if (description == "K" || description == "Q" || description == "J" || description == "A") {
			this.description = description;
			return;
		}
		if (Integer.parseInt(description) > 0 && (Integer.parseInt(description) < 11)) {

			this.description = description;
		}
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return description + " of  " + suit + ".";
	}

	public void setValue(int value) {
		this.value = value;
	}

}
