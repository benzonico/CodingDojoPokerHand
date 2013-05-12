package com.bzn.dojo.pokerhand;

import org.fest.assertions.Assertions;
import org.junit.Test;

public class PokerCardTest {

	@Test
	public void test() {
		Assertions.assertThat(new PokerCard("AH").compareTo(new PokerCard("2C"))).isGreaterThan(0);
	}

}
