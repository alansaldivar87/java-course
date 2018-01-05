package company;

import java.util.ArrayList;

public class Department {
	private String name;
	private String boss;
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public Department() {
		this.name = "Default department";
		this.boss = "Default boss";
	}
	
	public Department(String name, String boss, ArrayList<Employee> employees) {
		this.name = name;
		this.boss = boss;
		this.employees = employees;
	}
	
	public ArrayList<Employee> getEmployes() {
		return employees;
	}

	public void setEmployes(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBoss() {
		return boss;
	}
	public void setBoss(String boss) {
		this.boss = boss;
	}
	
	@Override
	public String toString() {
		String info = "Department: " + this.name + "\n\tBoss: " + this.boss + "\n\tEmployees: ";
		for (Employee employee: employees) {
			info += "\n" + employee.toString();
		}
		return info;
	}
}
