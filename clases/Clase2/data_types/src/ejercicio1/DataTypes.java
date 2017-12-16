package ejercicio1;

/**
 * 
 * @author alan.saldivar
 * Class used to understand data types.
 */
public class DataTypes {
	public static void main(String[] args) {
		int a = 3, f = 3;
		float b;
		double c;
		boolean d;
		
		/*
		 * Wrapper Classes
		 */
		Integer a2 = new Integer(9); // The same thing as using a regular int, but with the full power of an object.
		Float b2 =  new Float(6.0f); // Requires to finish always with an "f". Otherwise Java would read it as double instead.
		Double c2 = new Double(6.0); // For that reason many developers use double instead of float.
		Boolean d2 = new Boolean(false);
		
		/*
		 * Autoboxing:
		 * When setting a value of a primitive data type into a wrapper class.
		 */
		Integer v1 = 12;
		
		/*
		 * Unboxing:
		 * When setting a value of a wrapper class into a primitive data type. The inverse.
		 */
		int v2 = a2;
		
		/*
		 * There are 2 memory sets in Java: Stack and Heap.
		 * Stack: store primitive data types. Left side of variables
		 * Heap: store objects. Right side.
		 * When you use a variable like String, because there is no
		 * a primitive String data type, it would only save a pointer
		 * with hexadecimal number from stack to heap.
		 * If there's a new value for that String, Garbage Collector will
		 * detele it from memory and store only the latest value with
		 * a new hexadecimal pointer.
		 */
		
		String e = "Hola mundo";
		a = 5;		
		e = "Adiós";
		
		if (a == f) {
			System.out.println("a == f");
		}
		
		/*
		 * String variables
		 */
		String s1 = "HelloWorld!";
		String s2 = new String("HelloWorld!");
		
		if (s1 == s2) {
			System.out.println("s1==s2");
		}
		
		if (s1.equals(s2)) {
			System.out.println("s1.equals(s2)");
		}
		
	}
}
