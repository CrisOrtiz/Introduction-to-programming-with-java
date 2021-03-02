package basic_and_if_statments;

import java.util.Scanner;

public class EvenNumberCheck {

	public static void main(String[] args) {
		// Check if the entered number is even or not

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		boolean isEven = false;
		
		System.out.println("Enter an integer: ");		
				
		if (input.hasNextInt()) {
			
			int number = input.nextInt();
			
			if (number % 2 == 0) {
				isEven = true;
			}
			
			System.out.println("Is " + number + " an even number? " + isEven);
		}else {
			System.out.println("Invalid number, integer exepected");
		}
		
		
	}

}
