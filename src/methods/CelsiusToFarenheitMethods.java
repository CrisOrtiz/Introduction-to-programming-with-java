package methods;

import java.util.Scanner;

public class CelsiusToFarenheitMethods {

	public static void main(String[] args) {
		// Methods to convert celsius to farenheit and viceversa

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number corresponding of the " + "convertion needed");
		System.out.println("1: Farenheit to Celsius");
		System.out.println("2: Celsius to Farenheit");

		int convertionType = input.nextInt();
		double celsius;
		double farenheit;
		
		switch (convertionType) {
		case 1:

			System.out.println("Enter a degree in Farenheit: ");
			farenheit = input.nextDouble();

			celsius = FarenheitToCelsius(farenheit);

			System.out.println(farenheit + " Farenheit degrees is: " + celsius + " Celsius degrees.");

			break;
			
		case 2:

			System.out.println("Enter a degree in Celsius: ");
			celsius = input.nextDouble();

			farenheit = CelsiusToFarenheit(celsius);

			System.out.println(celsius + " Celsius degrees is: " + farenheit + " Farenheit degrees.");

			break;

		default:
			System.out.println("Invalit input, 1 or 2 expected.");
			
			break;
		}
	}

	public static double FarenheitToCelsius(double farenheit) {

		// Celsius Formula
		// c = (5/9) * (f-32)

		double celsius = (5 / 9) * (farenheit - 32);

		return celsius;
	}

	public static double CelsiusToFarenheit(double celsius) {

		// Farenheit Formula
		// f = (c * (9 / 5)) + 32

		double farenheit = (celsius * (9 / 5)) + 32;

		return farenheit;
	}
}
