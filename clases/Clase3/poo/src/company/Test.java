package company;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Department> departmentsSET1 = new ArrayList<Department>();
		ArrayList<Employee> employeesSET1 = new ArrayList<Employee>();
		
		employeesSET1.add(new Employee("Employee 1", "Developer", "Work hard!"));
		employeesSET1.add(new Employee("Employee 2", "Designer", "Work hard!"));
		employeesSET1.add(new Employee("Employee 3", "IT", "Work hard!"));
		employeesSET1.add(new Employee("Employee 4", "Social Media", "Work hard!"));
		
		departmentsSET1.add(new Department("Development", "Mr BOSS", employeesSET1));
		
		Enterprise enterprise1 = new Enterprise("CORP, Inc.", "Mr. CEO", departmentsSET1);
		
		System.out.println(enterprise1);
	}
}
