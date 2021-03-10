package interfaces;


public class TestJuicy {

	public static void main(String[] args) {
		
		
		Object[] objectsFruits = {new Apple(), new Banana(), new GrapeFruits(),
								  new Lemons(), new Orange()};
		
		for (int i = 0; i < objectsFruits.length; i++) {
			
			if(objectsFruits[i] instanceof Juicy) {
				System.out.println(((Juicy)objectsFruits[i]).makeFresh());
			}
		}
	}

}
