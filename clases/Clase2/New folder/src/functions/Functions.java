package functions;

public class Functions {
	public static void main(String[] args) {
		System.out.println(sum(2,2));
	}
	
	// Static is used to access directly the method, otherwise an object should be initializated.
	public static void print(String msg) {
		System.out.println(msg);
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
}
