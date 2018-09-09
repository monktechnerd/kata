package edu.learn.kata.bowlingGame;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class BowlingGameTest {

	@Test
	void whenBowlRolls_pinsKnockedDown_scoreAdds() {
		BowlingGame game = new BowlingGame();
		game.roll(5);
		assertEquals(5, game.score());
		game.roll(3);
		assertEquals(8, game.score());
	}
	
	@Test
	void whenSpare_nextPinsKnocked_isBonus() {
		BowlingGame game = new BowlingGame();
		game.roll(5);
		assertEquals(5, game.score());
		game.roll(5);
		
		// this frame was spare. so points of next roll will be added to this frames score.
		game.roll(5);
		assertEquals(20, game.score());
		game.roll(3);
		assertEquals(23, game.score());
	}

}
