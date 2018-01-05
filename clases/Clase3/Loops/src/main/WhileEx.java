package main;

public class WhileEx {
	public static void main(String[] args) {
		System.out.println("While Method");
		whileMethod();

		System.out.println("\n\ndoWhile Method");
		doWhileMethod();
	}
	
	/*
	 * WHile method
	 */
	public static void whileMethod () {
		int  i = 1;
		while (booleanExpression()) { // Boolean expressed from a method
			System.out.printf("%d, ", i);
			i++;
			if (i == 10) break; // If statement condition returns true, break it.
		}
	}
	
	/*
	 * Do While method
	 */
	public static void doWhileMethod () {
		int i = 1;
		do {
			System.out.printf("%d, ", i);
			i++;
			if (i == 10) break;
		} while (booleanExpression());
	}
	
	/*
	 * Boolean expression declared
	 */
	public static boolean booleanExpression() {
		System.out.println("Expression evaluated");
		return true;
	}
	
}
