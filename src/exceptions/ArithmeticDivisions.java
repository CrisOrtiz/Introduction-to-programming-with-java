package exceptions;

import java.util.Scanner;

public class ArithmeticDivisions {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two integers for division: ");
		
		double firstNumber = input.nextInt();
		double secondNumber = input.nextInt();
		
		try {
			double result = resultInteger(firstNumber, secondNumber);
			System.out.println(firstNumber + " / " + secondNumber + " = " + result);
			
		}catch(ArithmeticException ex) {
			System.out.println(ex);
		}
	}

	public static double resultInteger(double firstNumber, double secondNumber) {
		if(secondNumber == 0) {
			throw new ArithmeticException("The second number cannot be zero");
		}
		
		return firstNumber / secondNumber;
	}
}
