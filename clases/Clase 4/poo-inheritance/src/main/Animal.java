package main;

public class Animal {

	private int size;
	
	public Animal () {
		
	}
	
	public void eat() {
		System.out.println("Animal eating...");
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Size: " + size;
	}
	

}
