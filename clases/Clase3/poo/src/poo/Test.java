package poo;

public class Test {
	public static void main(String[] args) {
		Person person = new Person();
		Person person2 = new Person("Monica", 32, "Monterrey", new Cat("Pelusa", 8));
		Cat cat = new Cat("Felix", 6);

		// Lets change them!
		person.setAddress("San Franisco");
		person.setCat(cat);
		person.getCat().setAge(person.getCat().getAge() + 1);
		
		person2.setAddress("New Jersey");

		System.out.println("\n" + person.toString() + "\n\n" + person2.toString());
	}
}
