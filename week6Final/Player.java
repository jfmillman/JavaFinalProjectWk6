package week6Final;

public class Player {

	private String name;
	private Hand hand = new Hand();
	private int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Hand getHand() {
		return hand;
	}
	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
	
	
	public Player(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	
	
	
	
	public void draw(Deck deck) {
		hand.add(deck.remove(0));
	}
	
	
	
	public Card flip() {
		return hand.remove();
	}
	
	
	
	
	public void incrementScore() {
		setScore(getScore() + 1);
		
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}
