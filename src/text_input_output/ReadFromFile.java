package text_input_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		// Persistence
		// Read from a file

		File file = new File("E:\\output.txt");
		
		Scanner input = new Scanner(file);
		
		while(input.hasNextLine()) {
			String tmp = input.nextLine();
			
			System.out.println(tmp);
		}
		input.close();
	}

}
