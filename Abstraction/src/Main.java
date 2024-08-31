//Abstract class
abstract class Animal{
	//Abstract method
	public abstract void animalSound();
	//Regular method
	public void sleep() {
		System.out.println("Zzz");
	}
}

//Subclass (Inherit from Animal)
class Pig extends Animal {

	@Override
	public void animalSound() {
		//The body of animalSound() is provided here
		System.out.println("The pig says : wee wee");
	}
	
}

public class Main {

	public static void main(String[] args) {
		Pig myPig=new Pig();
		myPig.animalSound();
		myPig.sleep();
	}
}
