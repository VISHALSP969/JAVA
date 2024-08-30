
public class Main {
	//Static method
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects.");
	}
	
	//Public method
	public void myPublicMethod() {
		System.out.println("public methods must e called by creating objects.");
	}
	
	//main method
	public static void main(String[] args) {
		myStaticMethod();
		Main myObj=new Main();
		myObj.myPublicMethod();
	}

}
