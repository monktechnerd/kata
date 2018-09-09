package edu.learn.kata.NumberToLCD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberToLCDConverter {

	public List<Integer> breakToList(int num) {
		List<Integer> intList = new ArrayList<>();
		for (int i=num; i>0; i=(i/10)) {
			intList.add(i%10);
		}
		Collections.reverse(intList);
		return intList;
	}

}
