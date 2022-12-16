package week6Final;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("serial")
public class Deck extends LinkedList<Card> {
	private List<String> cardNum = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");
	private List<String> suites = List.of("Spades", "Hearts", "Clubs", "Diamonds");
	
	
public  Deck() {
	for(int cardPos = 0; cardPos < cardNum.size(); cardPos++) {
		int rank = cardPos + 1;
		String card = cardNum.get(cardPos);
		
		for (String suite : suites) {
			add (new Card (card, suite, rank));
		}
	}
}


public void shuffle() {
	Collections.shuffle(this);
	
}


@Override
public String toString() {
	StringBuilder b = new StringBuilder();
	return b.toString();
}
}
