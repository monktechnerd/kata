package edu.learn.kata.NumberToLCD;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import static org.hamcrest.Matchers.notNullValue;
import org.junit.jupiter.api.Test;


class NumberToLCDTest {

	@Test
	void givenNumber_divideInIndividualDigits() {
		int num = 123;
		NumberToLCDConverter converter = new NumberToLCDConverter();
		List<Integer> numList = converter.breakToList(num);
		assertThat(numList, notNullValue());
		assertEquals(3, numList.size());
		assertEquals(1, (int) numList.get(0));
		assertEquals(2, (int) numList.get(1));
		assertEquals(3, (int) numList.get(2));
	}
	
	@Test
	void given1_printLcd() {
		
	}

}
