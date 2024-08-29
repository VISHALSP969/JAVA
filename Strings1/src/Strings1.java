
public class Strings1 {

	public static void main(String[] args) {
		String greeting = "Hello";
	    System.out.println(greeting);
	    
	    //String length
	    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    System.out.println("The length of the txt string is: " + txt.length());
	    
	    //toUpperCase(),toLowerCase() methods
	    txt = "Hello World";
	    System.out.println(txt.toUpperCase());
	    System.out.println(txt.toLowerCase());
	    
	    //indexOf() method
	    txt = "Please locate where 'locate' occurs!";
	    System.out.println(txt.indexOf("locate"));
	    
	    //String concatenation
	    String firstName = "John";
	    String lastName = "Doe";
	    System.out.println(firstName + " " + lastName);
	    //using concat() method
	    System.out.println(firstName.concat(lastName));
	
	    int x = 10;
	    int y = 20;
	    int z = x + y;
	    System.out.println(z);
	    
	    String a = "10";
	    String b = "20";
	    String c = a + b;
	    System.out.println(c);
	    
	    String p = "10";
	    int q = 20;
	    String r = p + q;
	    System.out.println(r);
	    
	    //special characters
	    txt = "We are the so-called \"Vikings\" from the north.";
	    System.out.println(txt);
	    
	    txt = "It\'s alright.";
	    System.out.println(txt);
	    
	    txt = "The character \\ is called backslash.";
	    System.out.println(txt);
	    
	    txt = "Hello\nWorld!";
	    System.out.println(txt);
	    
	    txt = "Hello\rWorld!";
	    System.out.println(txt);
	    
	    txt = "Hello\tWorld!";
	    System.out.println(txt);
	    
	    txt = "Hel\blo World!";
	    System.out.println(txt);	    
	}

}
