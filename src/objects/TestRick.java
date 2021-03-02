package objects;

public class TestRick {

	public static void main(String[] args) {
		// Test class to se how Rick object is working	

		Rick rick1 = new Rick();

		System.out.println("rick1: " + rick1.toString());

		Rick rick2 = new Rick(true, true, true);

		System.out.println("rick2: " + rick2.toString());

		Rick rick3 = new Rick(false, false, false);

		System.out.println("rick3: " + rick3.toString());
	}
}
