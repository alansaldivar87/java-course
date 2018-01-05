package main;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int val;
		System.out.println("Write a number from 1 to 3:");
		
		val = scan.nextInt();
		
		String str = "";
		switch(val) {
			case 1: str = "Value is 1"; break;
			case 2: str = "Value is 2"; break;
			case 3: str = "Value is 3"; break;
			
			default: str = "Value exceeded!"; break;
		}
		System.out.println(str);
	}
}
