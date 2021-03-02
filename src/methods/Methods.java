package methods;

public class Methods {

	public static void main(String[] args) {
	// Methods
	// structure:
	// modifier returnValueType methodName(list of parameters){
	//   METHOD BODY
	// }		
		
		int firstValue = 10;
		int secondValue = 20;
		
		int result = maxValue(firstValue, secondValue);
		
		System.out.println("The max value is: " + result);
	}
	
	public static int maxValue(int firstParam, int secondParam) {
		
		int result;
		
		if(firstParam > secondParam) {
			result = firstParam;
		}else {
			result = secondParam;
		}
		return result;
	}
}
