package edu.learn.kata.bowlingGame;

public class BowlingGame {
	private int score;
	private int[] scoreCard;
	private int count;

	BowlingGame() {
		scoreCard = new int[20];
	}

	public void roll(int i) {
		scoreCard[count++] = i;
		if (isFrameStart() && count > 1) {
			if (isSpare(scoreCard[count - 1], scoreCard[count - 2])) {
				score = scoreCard[count - 1] + scoreCard[count - 2];
			}
		}
		score += i;
	}

	public int score() {
		return score;
	}

	private boolean isFrameStart() {
		if (count % 2 == 0) {
			return true;
		}
		return false;
	}

	private boolean isSpare(int prev, int secprev) {
		return (prev + secprev) == 10;
	}
}
