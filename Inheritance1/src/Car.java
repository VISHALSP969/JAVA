final class Vehicle{
	protected String brand="Ford";
	public void honk() {
		System.out.println("Tuut, tuut!");
	}
}

public class Car extends Vehicle {		//final class can't inherit
	private String modelName="Mustang";
	
	public static void main(String[] args) {
		Car myFastcar=new Car();
		
		myFastCar.honk();
	    System.out.println(myFastCar.brand + " " + myFastCar.modelName)
	}
}
