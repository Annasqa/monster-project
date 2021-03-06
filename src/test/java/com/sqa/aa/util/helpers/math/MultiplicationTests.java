package com.sqa.aa.util.helpers.math;

import static org.testng.Assert.*;

import java.util.*;

import org.testng.annotations.*;

import com.sqa.aa.util.helpers.*;

/**
 *   File Name: MyMathTest.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */

/**
 * MyMathTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */

public class MultiplicationTests {
	@DataProvider(name = "Multiplication Data")
	public static Object[][] getData() {
		Object[][] data = { { new double[] { 2.0, 3.0, 4.0, 2.0 }, 48 }, { new double[] { 2.0, 1.0, 5.0 }, 10 },
				{ new double[] { 3.0, 1.5 }, 4.5 }, { new double[] { 0.0, 5.0, 15.0, 10.0 }, 0.0 },
				{ new double[] { 1.0, 2.0, 2.5, 3.0, 6.0 }, 90.0 }, { new double[] { 1.5, 5.5, 0.0 }, 0.0 } };

		return data;
	}

	@Test(dataProvider = "Multiplication Data")
	public void testMultiplication(double[] numbers, double expectedResult) {
		double actualResult = MyMath.multNumbers(numbers);
		String numbersString = Arrays.toString(numbers);
		String errorMessage = String.format(
				"Error. The result of multilying all numbers %s is actually  %.2f not expected ", numbersString,
				actualResult);

		String message = String.format("The result of multiplying all numbers  %s" + " is %.2f ", numbersString,
				actualResult);
		System.out.println(message);
		// TestNg Params: Actual, Expected, delta, Message
		assertEquals(actualResult, expectedResult, 0, message);
	}

}
