package text_input_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteIntoFile {

	public static void main(String[] args) throws FileNotFoundException {
		// Persistence
		// Write into file

		File file = new File("E:\\output.txt");

		if(file.exists()) {
			System.exit(0);
		}

		PrintWriter output = new PrintWriter(file);

		output.print("Winter is comming... \n");
		output.print("Jhon Snow is the king in the north. \n");
		output.print("Jhon Snow slept with his aunt. \n");
		output.print("If I had such an aunt I would too. \n");

		output.close();
	}
}
