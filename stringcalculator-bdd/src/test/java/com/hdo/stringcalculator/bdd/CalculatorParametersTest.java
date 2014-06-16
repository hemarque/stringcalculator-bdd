package com.hdo.stringcalculator.bdd;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import com.hdo.stringcalculator.StringCalculator;

@RunWith(ConcordionRunner.class)
public class CalculatorParametersTest {

	public int add(String numbers) {
		StringCalculator calculator = new StringCalculator();
		return calculator.add(numbers);
	}

}
