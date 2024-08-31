abstract class MyClass{
	public String fname="John";
	public int age=24;
	public abstract void study();
}
class Main extends MyClass{
	public int graduationYear=2018;
	
	@Override
	public void study() {	//body of abstract method
		System.out.println("Studying all day long");		
	}
}
