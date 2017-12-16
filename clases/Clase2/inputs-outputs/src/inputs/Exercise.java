package inputs;

import java.util.Scanner;

/**
 * 
 * @author alan.saldivar
 * Exercise: write a number of 5 digits and output each digit separated with a tab
 */
public class Exercise {
	public static void main(String[] args) {
		int d1, d2, d3, d4, d5;
		
		System.out.println("Write a 5 digit number: ");
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		
		d5 = value % 10;
		d4 = (value / 10) % 10;
		d3 = (value / 100) % 10;
		d2 = (value / 1000) % 10;
		d1 = (value / 10000) % 10;		
		
		System.out.printf("%d\t %d\t %d\t %d\t %d\t ", d1, d2, d3, d4, d5);
		
	}
}
