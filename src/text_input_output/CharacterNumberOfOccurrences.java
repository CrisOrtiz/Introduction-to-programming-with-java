package text_input_output;

import java.util.Scanner;

public class CharacterNumberOfOccurrences {

	public static void main(String[] args) {
		// Find a the number of occurrences of a specified character
		// in the entered string
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String word = input.next();
		
		System.out.println("Enter the character to count on the string: ");
	
		String character = input.next();
		
		if(character.length() > 1) {
			System.out.println("Invalid input, a single character expected.");

		}else {
			int charAppearences = count(word, character.charAt(0));

			System.out.println(word + " contains " + charAppearences + " times" +
								" the character " + character);
		}
	}

	public static int count(String stringToCheck, char a) {
		int counter = 0;

		for (int i = 0; i < stringToCheck.length(); i++) {
			if(stringToCheck.charAt(i) == a) {
				counter ++;
			}
		}

		return counter;
	}

}
