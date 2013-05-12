package com.bzn.dojo.pokerhand;


public class PokerCard implements Comparable<PokerCard> {

	private enum Value {
		TWO('2'),
		THREE('3'),
		FOUR('4'),
		FIVE('5'),
		SIX('6'),
		SEVEN('7'),
		EIGHT('8'),
		NINE('9'),
		TEN('T'),
		JACK('J'),
		QUEEN('Q'),
		KINK('K'),
		ACE('A');

		private char fromChar;

		private Value(char value) {
			fromChar = value;
		}

		public static Value forChar(char fromChar) {
			for(Value value: values()) {
				if (value.fromChar == fromChar) {
					return value;
				}
			}
			throw new IllegalArgumentException();
		}
	}

	private enum Suit {
		H, S, C, D;
	}

	private Value value;

	private Suit suit;

	public PokerCard(String card) {
		value = Value.forChar(card.charAt(0));
		suit = Suit.valueOf(card.substring(1));
	}

	public int compareTo(PokerCard pokerCard) {
		return value.ordinal() - pokerCard.value.ordinal();
	}

}
