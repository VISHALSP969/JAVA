abstract class MyClass{
	public String fname="John";
	public String lname="Doe";
	public String email="john@doe.com";
	public int age=24;
	public abstract void study();	//abstract method 
}

//inheriting the abstract class
class Main extends MyClass{
	public int graduationYear=2018;
	
	//abstract method definition
	public void study() {
		System.out.println("Studying all day long");		
	}
}
