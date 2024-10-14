class MyClass{
	int a=10;
	int b=20;
}

public class SampleClass1 {

	public static void main(String[] args) {
		// Objects
		MyClass obj=new MyClass();
		System.out.println("a : "+obj.a+" b : "+obj.b);
		
		// Arrays
		int[] numbers= {1,2,3};
		System.out.println(numbers[1]);
		String name="John Smith";
		System.out.println(name);
		char[] str= {'H','e','l','l','o'};
		System.out.println(str);
	}
}
