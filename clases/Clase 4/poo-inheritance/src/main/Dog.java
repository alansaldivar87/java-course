package main;

public class Dog extends Animal{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void eat() {
		System.out.println("Dog eating...");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nName: " + name;
	}
	
}
