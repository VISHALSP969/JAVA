
public class Main {
	//static method
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects.");
	}
	
	//public method
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects.");
	}
	
	public static void main(String[] args) {
		myStaticMethod();	//call the static method
		//myPublicMethod();	//generate error
		
		Main myObj=new Main();	  //create an object
		myObj.myPublicMethod();	  //call the public method
		myObj.myStaticMethod();   //static method can also call through objects
	}
}
