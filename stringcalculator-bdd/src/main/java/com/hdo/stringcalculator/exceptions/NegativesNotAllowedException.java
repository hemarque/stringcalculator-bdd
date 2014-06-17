package com.hdo.stringcalculator.exceptions;

public class NegativesNotAllowedException extends RuntimeException {

	public NegativesNotAllowedException(String numbers) {
		super(numbers);
	}

}
