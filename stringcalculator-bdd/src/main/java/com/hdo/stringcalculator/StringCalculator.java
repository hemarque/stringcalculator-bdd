package com.hdo.stringcalculator;

public class StringCalculator {

	public int add(String numbers) {
		String delimiters = getDelimiters(numbers);
		numbers = cleanNumbersFormat(numbers, delimiters);
		return add(numbers.split(delimiters));
	}

	private String cleanNumbersFormat(String numbers, String delimiters) {
		return numbers.startsWith("//") ? numbers.substring(numbers
				.indexOf("\\n") + 2) : numbers;
	}

	private String getDelimiters(String numbers) {
		return numbers.startsWith("//") ? calculateDelimiters(numbers)
				: "\\\\n|,";
	}

	private String calculateDelimiters(String numbers) {
		return numbers.substring(2, numbers.indexOf("\\n"));
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
