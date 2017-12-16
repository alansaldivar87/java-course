package inputs;

import java.util.Scanner;

/**
 * 
 * @author alan.saldivar
 * This class shows how to receive inputs from console.
 */
public class ScannerEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  // Reads the inputs from  console
		
		String input;
		
		System.out.println("Write a string text: ");
		
		// Everything we write, saved here.
		input = scan.nextLine();
		
		System.out.println("\n\nYou wrote: " + input);
		
	}
}
