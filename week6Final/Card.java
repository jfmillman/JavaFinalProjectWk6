package week6Final;

public class Card {

	private String card; 
	private String suite; 
	private int rank;
	
	public Card(String card, String suite, int rank) {
		this.card = card;
		this.suite = suite;
		this.setRank(rank);
	}

	@Override
	public String toString() {
		return card + " of " + suite;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
