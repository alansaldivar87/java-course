package outputs;

public class Outputs {
	public static void main(String[] args) {

		System.out.print("This is a message printed in console"); // Prints without line break
		System.out.println("This is a message printed in console"); // Prints with line break
		
		/*
		 *  Escape Sequences
		 *  \n --- line break
		 *  \t --- horizontal tab
		 *  \r --- returns cursor to the start
		 *  \\ --- Writes a single backslash \
		 *  \" --- Quote the string
		 */
		
		/*
		 * Format printing
		 */
		System.out.print("Here is used \\ n to do\n a line break. \n");
		
		System.out.printf("Formated printing... %nNumbers: %d %nStrings: %s", 3, "text");
		
	}
}
