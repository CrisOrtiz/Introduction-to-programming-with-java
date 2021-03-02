package objects;

public class TestCircle {

	public static void main(String[] args) {
		// Testing how object circle is working

		Circle circle = new Circle();

		System.out.println("The circle1 radius is: " + circle.radius + ", the area is: " + circle.getArea());

		Circle circle2 = new Circle(3);

		System.out.println("The circle2 radius is: " + circle2.radius + ", the area is: " + circle2.getArea());

		Circle circle3 = new Circle();

		System.out.println("The circle3 radius is: " + circle3.radius + ", the area is: " + circle3.getArea());

	}
}
