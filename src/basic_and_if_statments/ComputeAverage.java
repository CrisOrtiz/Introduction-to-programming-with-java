package basic_and_if_statments;

import java.util.Scanner;

public class ComputeAverage {

	public static void main(String[] args) {
		// Compute 3 numbers average
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter value for 3 variables:");
		
		int firstVaraible = input.nextInt();
		int secondVaraible = input.nextInt();
		int thirdVaraible = input.nextInt();
		
		int average = (firstVaraible + secondVaraible + thirdVaraible) / 3;
		
		System.out.println("The average of " + firstVaraible + ", " + secondVaraible + " and " + thirdVaraible + " is: " + average);

	}

}
