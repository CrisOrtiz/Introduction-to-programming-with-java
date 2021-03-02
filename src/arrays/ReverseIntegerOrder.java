package arrays;

import java.util.Scanner;

public class ReverseIntegerOrder {

	public static void main(String[] args) {
		// Read 10 integers and display them in the reverse order

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter ten numbers separated by comas. Example: 1,2,3,4,5,6,7,8,9,10 ");
		System.out.println("");

		String[] data = input.nextLine().split(",");

		if (data.length != 10) {

			System.out.println("Invalid input, must enter 10 numbers separated by comas.");

		} else {
			System.out.println("Array inverted: ");
			for (int i = data.length - 1; i >= 0; i--) {

				System.out.print("|" + data[i]);
			}
			System.out.print("|");
		}
	}

}
