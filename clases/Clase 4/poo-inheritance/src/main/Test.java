package main;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		Animal dog2 = new Dog();
		Animal cat = new Cat();
		
		dog.setSize(5);
		dog.setName("Firulais");
		
		dog.eat();
		((Dog)dog2).eat(); // Cast type from Animal to Dog.
		dog2.eat();
		cat.eat();
		
		// System.out.println(dog.toString());
		
	}
}
