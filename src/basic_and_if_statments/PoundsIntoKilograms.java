package basic_and_if_statments;

import java.util.Scanner;

public class PoundsIntoKilograms {

	public static void main(String[] args) {
		// Pounds into kilograms
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value in pounds: ");
		
		double pounds = input.nextDouble();
		
		//Pounds to Kilograms formula
		//k = (p / 0.454)
		
		double kilograms = pounds * 0.454;
		
		System.out.println(pounds + " Pounds are: " + kilograms + " Kilograms");

	}

}
