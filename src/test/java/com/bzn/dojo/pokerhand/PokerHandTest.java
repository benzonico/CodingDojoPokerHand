package com.bzn.dojo.pokerhand;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class PokerHandTest {

	@Test
	public void whiteHandHighestCardIsHigherThanHighestBlackHandCard() {
		PokerHand white = new PokerHand("2H", "3S", "TD", "QS", "KC");
		PokerHand black = new PokerHand("3H", "5S", "9D", "JS", "4H");
		
		assertThat(white.hasHigherCardThan(black)).isTrue();
		assertThat(black.hasHigherCardThan(white)).isFalse();
	}
}

