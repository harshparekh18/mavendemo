package testCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import Calculator.CalculatorSample;

public class TestCalculatorSample {
	CalculatorSample c = new CalculatorSample();

	@Test
	public void test() {
		assertEquals(5, c.add(2, 3));
	}

}
