package basic_and_if_statments;

import java.util.Scanner;

public class IfMathematics {

	public static void main(String[] args) {
		// If staments depending on math sign entered
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter + or -");

		String sign = input.nextLine();
		
		System.out.println("Enter the first number: ");
		int firstValue = input.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		int secondValue = input.nextInt();
		
		if(sign.equals("+")) {
			System.out.println("The adition of " + firstValue + " and "
					+ secondValue + " is: " + (firstValue + secondValue));
		}else if(sign.equals("-")) {
			System.out.println("The subtraction of " + firstValue + " and "
					+ secondValue + " is: " + (firstValue - secondValue));
		}else {
			System.out.println("Invalid Sign, should enter + or -");
		}
	}

}
