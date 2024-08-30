
public class Classes {
	int x=5;
	public static void main(String[] args) {
		//create an object
		MyClass myObj=new MyClass();
		System.out.println(myObj.x);
		
		//creating multiple objects
		MyClass myObj1=new MyClass();
		MyClass myObj2=new MyClass();
		System.out.println(myObj1.x);
		System.out.println(myObj2.x);
	}
}
