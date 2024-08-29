
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
	}

}
