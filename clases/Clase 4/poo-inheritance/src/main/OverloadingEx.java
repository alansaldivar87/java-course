package main;

public class OverloadingEx {
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @throws NumberFormatException
	 */
	public static int sum(String a, String b) throws NumberFormatException {
		throw new NumberFormatException();
		// parseInt because method expects integer
		// return Integer.parseInt(a) + Integer.parseInt(b);
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public static void ExceptionTest(int a, int b) {
		try {
			System.out.println(a/b);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("You can't divide by zero bro!!!");
		} finally {
			System.out.println("**** Finally block *****");
		}
		
	}

	public static void forceException() {
		// TODO Auto-generated method stub
		
	}
	
}
