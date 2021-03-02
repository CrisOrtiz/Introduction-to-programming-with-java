package arrays;

public class MultidimentionalArrays {

	public static void main(String[] args) {
		// Multidimentional Arrays
		// Multidimensional arrays
		// elementType arrayRefVar[][] = new elementType[arraySizeX][arraySizeY]

		double[][] myMultiList = { { 1, 2.3, 3.5 }, { 4.4, 5, 6 }, { 7, 8.2, 9 }, { 10.10, 11, 12 } };

		printArraysValues(myMultiList);
		sumArraysValues(myMultiList);
		maxInArrays(myMultiList);
	}

	private static void printArraysValues(double[][] myMultiList) {
		for (int i = 0; i < myMultiList.length; i++) {
			for (int j = 0; j < myMultiList[i].length; j++) {
				System.out.print("|" + myMultiList[i][j]);
			}
			System.out.print("| \n");
		}
	}

	private static void sumArraysValues(double[][] myMultiList) {

		double sum = 0;
		for (int i = 0; i < myMultiList.length; i++) {
			for (int j = 0; j < myMultiList[i].length; j++) {
				sum += myMultiList[i][j];
			}
		}
		System.out.println("The sum of array elements is: " + sum);
	}

	private static void maxInArrays(double[][] myMultiList) {
		double max = 0;

		for (int i = 0; i < myMultiList.length; i++) {
			for (int j = 0; j < myMultiList[i].length; j++) {
				if (myMultiList[i][j] > max) {
					max = myMultiList[i][j];
				}
			}
		}

		System.out.println("The max value in array is: " + max);
	}

}
