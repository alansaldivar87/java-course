package main;

import java.util.ArrayList;

public class ForEx {
	public static void main(String[] args) {
		System.out.println("For example");
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d ", i);
		}
		
		System.out.println("\n\nFor each example");
		ArrayList<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		for (String string : list) {
			System.out.println(string);
		}
	}
}
