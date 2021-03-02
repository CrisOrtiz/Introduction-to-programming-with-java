package basic_and_if_statments;

import java.util.Scanner;

public class ComputeArea {

	public static void main(String[] args) {
		/* How to create a project and a class in java*/
		System.out.println("Hello java!");
		
		//Calculate Area
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double radius;
		double area;
		
		System.out.println("Enter a value for radius: ");
		radius = input.nextInt();
		
		area = radius * radius * 3.14157;
		
		System.out.println("The area is: " + area);
	}
	
}
