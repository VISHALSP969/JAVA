
public class SampleClass2 {

	public static void main(String[] args) {
		// Java Literals primitive datatype
		byte a=68;
		char ch='A';
		int i=100;
		System.out.println(a+"   "+ch+"   "+i);
		
		// number system literals
		int decimal=100;
		int octal=0144;
		int hex=0x64;
		System.out.println(decimal+"   "+octal+"   "+hex);	
		
		// string literals
		String str1="Hello world";
		String str2="two\nlines";
		String str3="\"This is in quotes\"";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		char c='\u0001';
		String s="\u0001";
		System.out.println(c+"   "+s);
	}
}
