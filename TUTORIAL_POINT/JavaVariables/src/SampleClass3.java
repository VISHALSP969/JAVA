
public class SampleClass3 {
	
	// this instance variable is visible for any child class
	public String name;
	
	// this salary variable is visible inside the class only
	private double salary;
	
	// the name variable is assigned i the constructor
	public SampleClass3(String name) {
		this.name=name;
	}
	
	// the salary variable is assigned a value
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	// this method prints the details
	public void printInfo() {
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
	}
	
	public static void main(String[] args) {
		SampleClass3 obj=new SampleClass3("Ransika");
		obj.setSalary(35000);
		obj.printInfo();
	}
}
