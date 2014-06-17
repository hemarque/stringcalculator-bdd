package com.hdo.stringcalculator;

import com.hdo.stringcalculator.exceptions.NegativesNotAllowedException;

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
		String negatives = "";
		int result = 0;
		int current = 0;
		for (String number : numbersArray) {
			current = castToInt(number);
			current = skipBigNumber(result, current);
			negatives = nameTheNegative(negatives, current);
			result += current;
		}
		reportNegativeNumbers(negatives);
		return result;
	}

	private void reportNegativeNumbers(String negatives) {
		if (!negatives.isEmpty())
			throw new NegativesNotAllowedException(negatives.trim());
	}

	private String nameTheNegative(String negatives, int current) {
		if (current < 0)
			negatives = negatives + current + " ";
		return negatives;
	}

	private int skipBigNumber(int result, int current) {
		return current > 1000 ? 0 : current;
	}

	private int castToInt(String number) {
		return !number.isEmpty() ? Integer.parseInt(number) : 0;
	}

}
