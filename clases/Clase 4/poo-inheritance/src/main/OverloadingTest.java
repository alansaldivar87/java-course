package main;

public class OverloadingTest {
	
	public static void main(String[] args) {
		int result = OverloadingEx.sum(3, 2);
		System.out.println(result);
		
		result = OverloadingEx.sum(5, 5, 5);
		System.out.println(result);
		
		OverloadingEx.forceException();
		
		try {
			OverloadingEx.sum("A", "5");
			System.out.println(result);
		} catch(Exception e) {
			System.out.println(e);
		}
		
		OverloadingEx.ExceptionTest(6, 0);
		
	}
}
