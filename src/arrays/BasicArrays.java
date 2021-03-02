package arrays;

public class BasicArrays {

	public static void main(String[] args) {
		// Basic Arrays
		// Single dimensional arrays
		// elementType arrayRefVar[] = new elementType[arraySize]
		
		double[] myList = {1, 8, 2.9, 3.4, 4.6, 2, 1};

		printArraysValues(myList);
		sumArraysValues(myList);
		maxInArrays(myList);
	}
	
	private static void printArraysValues(double[] myList) {
		for (int i = 0; i < myList.length; i++) {
			
			System.out.print("|" + myList[i]);
		}
		System.out.print("| \n");
	}
	
	private static void sumArraysValues(double[] myList) {
		
		double sum = 0;
		for (int i = 0; i < myList.length; i++) {
			
			sum += myList[i];
		}
		System.out.println("The sum of array elements is: " + sum);
	}
	
	private static void maxInArrays(double[] mylist) {
		double max = 0;
		
		for (int i = 0; i < mylist.length; i++) {
			if(mylist[i] > max ) {
				max = mylist[i];
			}
		}
		
		System.out.println("The max value in array is: " + max);
	}

}
