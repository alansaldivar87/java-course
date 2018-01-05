package company;

import java.util.ArrayList;

public class Enterprise {
	private String name;
	private String CEO;
	private ArrayList<Department> departments = new ArrayList<Department>();
	
	public Enterprise() {
		this.name = "Default Enterprise, INC.";
		this.CEO = "Mr. John Doe";
	}
	
	public Enterprise(String name, String CEO, ArrayList<Department> departments) {
		this.name = name;
		this.CEO = CEO;
		this.departments = departments;
	}
	
	public ArrayList<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCEO() {
		return CEO;
	}
	public void setCEO(String cEO) {
		CEO = cEO;
	}
	
	@Override
	public String toString() {
		String info = "Company name: " + this.name + "\nCEO: " + this.CEO + "\nDepartments: ";
		for (Department department: departments) {
			info += "\n\t" + department.toString();
		}
		return info;
	}
}
