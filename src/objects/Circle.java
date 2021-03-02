package objects;

public class Circle {
	// Object
	// state
	// behaviour

	protected double radius;

	public Circle() {
		this.radius = 2;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {

		double area = this.radius * this.radius * Math.PI;

		return area;
	}
}
