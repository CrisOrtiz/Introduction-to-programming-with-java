package basic_and_if_statments;

import java.util.Scanner;

public class VolumeOfCylinder {

	public static void main(String[] args) {
		// Compute a cylinder´s volume
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a radius of a cylinder: ");
		double radius = input.nextDouble();
		
		System.out.println("Enter a length of a cylinder: ");
		double length = input.nextDouble();
		System.out.println("");
		
		// Area of a cylinder formula
		// a = r * r * pi
		
		double area = radius * radius * Math.PI;
		
		System.out.println("The area is: " + area + "\n");
		
		// Volume of a cylinder formula
		// v = a * l
		
		double volume = area * length;
		System.out.println("The volume is: " + volume);

	}

}
