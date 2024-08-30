
public class Methods5 {
	
	static int myMethod(int x) {
		return 5+x;
	}
	
	static int myMethod1(int x,int y) {
		return x+y;
	}

	public static void main(String[] args) {
		System.out.println(myMethod(3));
		System.out.println(myMethod1(5,4));
		
		int z=myMethod1(5, 6);
		System.out.println(z);
	}
}
