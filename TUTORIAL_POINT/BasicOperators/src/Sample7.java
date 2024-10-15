class SuperClass {}

public class Sample7 extends SuperClass {

	public static void main(String[] args) {
		String name="James";
		// following will return true since name is type of string
		boolean result=name instanceof String;
		System.out.println(result);
		
		Sample7 obj=new Sample7();
		result=obj instanceof Sample7;
		System.out.println(result);
	}
}
