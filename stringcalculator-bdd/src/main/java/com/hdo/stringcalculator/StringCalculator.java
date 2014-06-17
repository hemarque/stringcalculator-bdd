package com.hdo.stringcalculator;


public class StringCalculator {

	public int add(String numbers) {
		return add(numbers.split("\\\\n|,"));
	}

	private int add(String[] numbersArray) {
		int result = 0;
		for (String number : numbersArray) {
			if (!number.isEmpty())
				result += Integer.parseInt(number);
		}
		return result;
	}

}
