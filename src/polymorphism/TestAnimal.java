package polymorphism;

public class TestAnimal {

	public static void main(String[] args) {
		// Test for animals to see polymorphism
		// see how objects being declared similarly but are different

		Dog germanShepart = new Dog();
		germanShepart.setBarking("Barking");
		germanShepart.setCuddle("Cuddiling");
		germanShepart.setEat("Give me food!");
		germanShepart.setWalk("Running");

		Dog smallDog = new Dog();
		smallDog.setBarking("Too small to bark");
		
		Cat littleKitty = new Cat();
		littleKitty.setMeow("Meeeeoow!");

		displayAnimal(germanShepart);
		displayAnimal(littleKitty);
		displayAnimal(smallDog);

		Dog doggoArgentino = new Dog();

		doggoArgentino.setBarking("Big bark");
		doggoArgentino.setEat("Give me a lot of food!!");

		displayAnimal(doggoArgentino);
	}

	private static void displayAnimal(Animal animalObj) {
		System.out.println(animalObj.toString());
	}
}
