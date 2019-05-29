package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculator.MathMethods;

public class MathMethodsTest {
	MathMethods mathMethods;

	@Before
	public void setUp() {
		// arrange
		mathMethods = new MathMethods();
	}

	@Test
	public void additionTest() {
		// acting
		int result = mathMethods.addition(1, 3);
		// assertion
		assertEquals(4, result);
	}

	@Test
	public void subtractionTest() {
		int result = mathMethods.subtraction(3, 2);
		assertEquals(1, result);
	}

	@Test
	public void subtractionFirstNumberIsLessThanSecondTest() {
		int result = mathMethods.subtraction(2, 3);
		assertEquals(-1, result);
	}

	@Test
	public void multiplicationTest() {
		int result = mathMethods.multiplication(4, 2);
		assertEquals(8, result);
	}

	@Test
	public void divisionTest() {
		int result = mathMethods.division(6, 2);
		assertEquals(3, result);
	}
}
