package methods;

public class MaxValue {

	public static void main(String[] args) {
		// Methods
		// structure:
		// modifier returnValueType methodName(list of parameters){
		// METHOD BODY
		// }

		int firstValue = 10;
		int secondValue = 20;

		int result = maxValue(firstValue, secondValue);
		System.out.println("The max value is: " + result);
		
		
		double firstValueDouble = 10;
		double secondValueDouble = 20;

		double resultDouble = maxValue(firstValueDouble, secondValueDouble);
		System.out.println("The max value in double is: " + resultDouble);
	}

	public static int maxValue(int firstParam, int secondParam) {

		int result;

		if (firstParam > secondParam) {
			result = firstParam;
		} else {
			result = secondParam;
		}
		return result;
	}

	public static double maxValue(double firstParam, double secondParam) {

		double result;

		if (firstParam > secondParam) {
			result = firstParam;
		} else {
			result = secondParam;
		}
		return result;
	}
}
