package methods;

import java.util.Scanner;

public class MileConvertion {

	public static void main(String[] args) {
		// Method to show converte miles to kilometers
		// show number of rows of table pending on number entered
		
		System.out.println("");
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to display mile convertion table: ");
		int rows = input.nextInt();
		MilesToKilometers(rows);
	}
	
	public static void MilesToKilometers(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.println(i + "   " + (i * 6904));
		}
	}

}
