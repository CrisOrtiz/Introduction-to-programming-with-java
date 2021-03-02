package basic_and_if_statments;

import java.util.Scanner;

public class FareheitToCelsius {

	public static void main(String[] args) {
		// FareheitToCelsius
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a degree in farenheit: ");
		
		double farenheit = input.nextDouble();
		
		//Celsius Formula
		// c = (5/9) * (f-32)
		
		double celsius = (5/9) * (farenheit - 32);
		
		System.out.println(farenheit + " farenheit degrees is: " + celsius + " in Celsius degrees");
	}

}
