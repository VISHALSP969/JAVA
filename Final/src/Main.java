final class Vehicle{
	protected String brand="Ford";
	public void honk() {
		System.out.println("Tuut, tuut!");
	}
}
class Main extends Vehicle{	 //final class can't be inherited
	private String modelName="Mustang";
	public static void main(String[] args) {
		Main myFastCar=new Main();
		myFastCar.honk();
		System.out.println("myFastCar.brand"+" "+myfastCar.modelName);
	}
}
