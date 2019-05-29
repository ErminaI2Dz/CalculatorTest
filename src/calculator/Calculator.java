package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		MathMethods mathMethods = new MathMethods();

		int choose;

		do {

			System.out.println("Choose!\n");
			System.out.println("1---addition");
			System.out.println("2---subtraction");
			System.out.println("3---multiplication");
			System.out.println("4---division");
			System.out.println("0---exit");
			choose = input.nextInt();

			if (choose == 1) {

				System.out.print("\nInput first number: ");
				int num1 = input.nextInt();
				System.out.print("Input second number:");
				int num2 = input.nextInt();

				System.out.println(num1 + " + " + num2 + " = " + mathMethods.addition(num1, num2) + "\n");

			} else if (choose == 2) {

				System.out.print("\nInput first number: ");
				int num1 = input.nextInt();
				System.out.print("Input second number:");
				int num2 = input.nextInt();

				System.out.println(num1 + " - " + num2 + " = " + mathMethods.subtraction(num1, num2) + "\n");

			} else if (choose == 3) {

				System.out.print("\nInput first number: ");
				int num1 = input.nextInt();
				System.out.print("Input second number:");
				int num2 = input.nextInt();

				System.out.println(num1 + " * " + num2 + " = " + mathMethods.multiplication(num1, num2) + "\n");

			} else if (choose == 4) {

				System.out.print("\nInput first number: ");
				int num1 = input.nextInt();
				System.out.print("Input second number:");
				int num2 = input.nextInt();

				System.out.println(num1 + " : " + num2 + " = " + mathMethods.division(num1, num2) + "\n");

			} else if (choose < 0 || choose > 6) {

				System.out.println("Input error!\n");
			}

		} while (choose != 0);

		input.close();

	}
}
