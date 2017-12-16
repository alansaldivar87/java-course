package inputs;

import java.util.Scanner;

/**
 * 
 * @author alan.saldivar
 * Class ScannerEx2
 * Shows how to read input from numeric type
 */
public class ScannerEx2 {
	public static void main(String[] args) {
		
		// Create an object of the Scanner type
		Scanner scan = new Scanner(System.in);
		
		// Declare all variables as int
		int val1, val2, sum;
		
		System.out.println("Write the first value: ");
		// nextInt() method of scan object reads the input as a numeric value
		val1 = scan.nextInt();
		
		System.out.println("Write the second value: ");
		val2 = scan.nextInt();
		
		// Sum them
		sum = val1 + val2;
		
		System.out.printf("The sum of both values is: %d", sum);
		
	}
}
