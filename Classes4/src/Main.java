
public class Main {
	final int x=10;
	
	public static void main(String[] args) {
		Main myObj=new Main();
		System.out.println(myObj.x);
		
		//smyObj.x=25;		//error:cannot assign a value to final variable
		System.out.println(myObj.x);
	}
}
