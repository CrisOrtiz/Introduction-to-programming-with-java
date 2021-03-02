package methods;

public class MaxValueVoid {
	public static void main(String[] args) {
		// Methods
		// structure:
		// modifier returnValueType methodName(list of parameters){
		// METHOD BODY
		// }

		int firstValue = 10;
		int secondValue = 20;

		maxValue(firstValue, secondValue);
	}


	public static void maxValue(int firstParam, int secondParam) {

		int result;

		if (firstParam > secondParam) {
			result = firstParam;
		} else {
			result = secondParam;
		}

		System.out.println("The max value is: " + result);
	}
}
