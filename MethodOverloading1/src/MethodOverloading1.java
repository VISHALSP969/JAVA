
public class MethodOverloading1 {
	static int plusMethod(int x,int y) {
		return x+y;
	}
	
	static double plusMethod(double x,double y) {
		return x+y;
	}
	public static void main(String[] args) {
		int myNum1=plusMethod(5, 8);
		double myNum2=plusMethod(4.3, 6.26);
		System.out.println(myNum1);
		System.out.println(myNum2);
	}
}
