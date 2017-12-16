package ifstatement;

public class Ejercicio1 {
	public static void main(String[] args) {
		boolean a = true;
		
		if (a) {
			System.out.println("TrueStory");
		} else {
			System.out.println("Nope. Won't run");
		}
		
		int b = (a) ? 5 : 0;
		System.out.println(b);

	}
}
