package calculator;

public class MathMethods {

	// Method adds two numbers
	public int addition(int number1, int number2) {

		return number1 + number2;
	}

	// Method subtracts two numbers
	public int subtraction(int number1, int number2) {

		if (number1 < number2)
			return (-1) * (number2 - number1);
		else
			return number1 - number2;
	}

	// Method multiplies two numbers
	public int multiplication(int number1, int number2) {

		return number1 * number2;
	}

	// Method divides  two numbers
	public int division(int broj1, int broj2) {

		return broj1 / broj2;
	}

}
