//Interfaces
interface Animal{
	public void animalSound();	//interface method (does not have a body)
	public void sleep();		//interface method (does not have a body)
}

class Pig implements Animal{

	@Override
	public void animalSound() {
		//The body of animalSound() is provided here
		System.out.println("The pig says : wee wee");		
	}

	@Override
	public void sleep() {
		//The body of sleep() is provided here
		System.out.println("Zzz");		
	}	
}

public class Main {

	public static void main(String[] args) {
		Pig myPig=new Pig();	//creating Pig object
		myPig.animalSound();
		myPig.sleep();
	}
}
