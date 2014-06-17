package com.hdo.stringcalculator.bdd;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import com.hdo.stringcalculator.StringCalculator;

@RunWith(ConcordionRunner.class)
public class CalculatorNegativesNotAllowedTest {

	public int add(String numbers) {
		StringCalculator calculator = new StringCalculator();
		return calculator.add(numbers);
	}

	public String addWithException(String numbers) {
		try {
			StringCalculator calculator = new StringCalculator();
			return calculator.add(numbers) + "";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
}
