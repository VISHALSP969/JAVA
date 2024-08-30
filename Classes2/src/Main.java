
public class Main {
	int x=10;
	public static void main(String[] args) {
		MyClass myObj=new MyClass();
		System.out.println(myObj.x);
		System.out.println(myObj.y);
		
		//modify the class attributes
		myObj.x=20;
		myObj.y=30;
		System.out.println(myObj.x);
		System.out.println(myObj.y);
		myObj.x=200;
		myObj.y=300;
		System.out.println(myObj.x);
		System.out.println(myObj.y);
	}

}
