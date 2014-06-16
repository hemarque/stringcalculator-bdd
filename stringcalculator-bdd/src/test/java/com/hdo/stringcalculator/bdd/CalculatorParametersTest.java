package com.hdo.stringcalculator.bdd;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class CalculatorParametersTest {

	public int add(String numbers) {
		if(numbers.length()==0)
			return 0;
		
		String[] numbersArray = numbers.split(",");
		
		if(numbersArray.length==1)
			return Integer.parseInt(numbers);
		
		int first = Integer.parseInt(numbersArray[0]);
		int second = Integer.parseInt(numbersArray[1]);
		return first + second;
	}


}
