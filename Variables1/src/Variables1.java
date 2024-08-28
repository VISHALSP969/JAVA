
public class Variables1 {

	public static void main(String[] args) {
		String name="John";
		System.out.println(name);
		
		int myNum1=15;
		System.out.println(myNum1);
		
		int myNum2;
		myNum2=20;
		System.out.println(myNum2);
		
		int myNum3=25;
		myNum3=30;
		System.out.println(myNum3);
		
		//final variable-unchangeable and read only
		final int myNum4=50;
		//myNum4=100;		//cannot assign a value to final variable
		System.out.println(myNum4);
		
		int int_num=5;
		//for float numbers there should be f to represent as float
		float float_num=5.99f;
		char letter='A';
		boolean bool_value=true;
		String str="Hello";
		System.out.println(int_num);
		System.out.println(float_num);
		System.out.println(letter);
		System.out.println(bool_value);
		System.out.println(str);
	}

}
