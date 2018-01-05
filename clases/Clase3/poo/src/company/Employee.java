package company;

public class Employee {
	private String name;
	private String position;
	private String jobTasks;
	
	public Employee () {
		this.name = "Default worker";
		this.position = "Default position";
		this.jobTasks = "---";
	}
	
	public Employee (String name, String position, String jobTasks) {
		this.name = name;
		this.position = position;
		this.jobTasks = jobTasks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getJobTasks() {
		return jobTasks;
	}
	public void setJobTasks(String jobTasks) {
		this.jobTasks = jobTasks;
	}
	
	@Override
	public String toString() {
		return "\t\tEmploye name: " + this.name +
				"\n\t\tPosition: " + this.position +
				"\n\t\tJob Tasks: " + this.jobTasks + '\n';
	}
}
