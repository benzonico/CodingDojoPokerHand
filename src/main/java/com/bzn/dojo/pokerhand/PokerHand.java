package com.bzn.dojo.pokerhand;

import java.util.SortedSet;
import java.util.TreeSet;

public class PokerHand {

	private SortedSet<PokerCard> cards;

	public PokerHand(String card1, String card2, String card3,
			String card4, String card5) {
		this.cards = new TreeSet<>();
		this.cards.add(new PokerCard(card1));
		this.cards.add(new PokerCard(card2));
		this.cards.add(new PokerCard(card3));
		this.cards.add(new PokerCard(card4));
		this.cards.add(new PokerCard(card5));
	}

	public boolean hasHigherCardThan(PokerHand black) {
		return highest().compareTo(black.highest()) > 0;
	}

	private PokerCard highest(){
		return cards.last();
	}
	
}
