
public class Sample1 {

	public static void main(String[] args) {
		String greeting="Hello World!";		// string
		System.out.println(greeting);
		
		char[] helloArray= {'h','e','l','l','o'};		// character array
		System.out.println(helloArray);
		
		String newString=new String(helloArray);
		System.out.println(newString);
	}
}
