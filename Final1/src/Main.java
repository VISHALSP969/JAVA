
public class Main {
	final int x=10;
	final double PI=3.14;

	public static void main(String[] args) {
		Main myObj=new Main();
		//myObj.x=50;		//generate error
		//myObj.PI=25;		//generate error
		
		System.out.println(myObj.x);
		System.out.println(myObj.PI);
	}
}
