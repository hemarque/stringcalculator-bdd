package com.hdo.stringcalculator.bdd;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class CalculatorParametersTest {

	public int add(String numbers) {
		if (numbers.length() == 0)
			return 0;
		return add(numbers.split(","));
	}

	private int add(String[] numbersArray) {
		return numbersArray.length == 1 ? Integer.parseInt(numbersArray[0])
				: addFirstTwo(numbersArray);
	}

	private int addFirstTwo(String[] numbersArray) {
		int first = Integer.parseInt(numbersArray[0]);
		int second = Integer.parseInt(numbersArray[1]);
		return first + second;
	}

}
