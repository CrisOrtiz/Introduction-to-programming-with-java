package abstarct_classes_and_interfaces;

public class TestAnimal {

	public static void main(String[] args) {
		// Test for animals to see inheritance working

		Dog germanShepart = new Dog();
		germanShepart.setBarking("Barking");
		germanShepart.setCuddle("Cuddiling");
		germanShepart.setEat("Give me food!");
		germanShepart.setWalk("Running");
		
		System.out.println(germanShepart.toString());
		
		Dog smallDog = new Dog();
		smallDog.setBarking("Too small to bark");
		
		System.out.println(smallDog.toString());
		
		Cat littleKitty = new Cat();
		littleKitty.setMeow("Meeeeoow!");
		
		System.out.println(littleKitty.toString());
	}
}
