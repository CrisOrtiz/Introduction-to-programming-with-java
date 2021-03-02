package while_loops;

public class MilesConvertAndLoop {

	public static void main(String[] args) {
		// Display the conversion of miles to kilometers
		// until 10 miles
		
		int miles = 1;
		
		// Miles to kilometers formula
		// k = 1 * 1609
		
		while (miles <= 10) {
			int kilometers = miles * 1609;
			System.out.println(miles + " mile is: " + kilometers + " kilometers");
			miles ++;
		}

	}

}
