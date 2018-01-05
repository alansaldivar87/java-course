package poo;

/*
 * POJO (Plan Old Java Object)
 */
public class Person {
	private String name;
	private int age;
	private String address;
	private Cat cat;
	
	// Default constructor
	public Person(){
		this.name = "Alan";
		this.age = 30;
		this.address = "Apodaca";
		this.cat = new Cat("Yoshi", 3);
	}
	
	// Parametric constructor
	public Person(String name, int age, String address, Cat cat) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.cat = cat;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public void setAddress (String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name +
				"\nAge: " + this.age +
				"\nAddress: " + this.address +
				"\nCat: " + this.cat.toString();
	}
}
