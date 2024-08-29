
public class Datatypes {

	public static void main(String[] args) {
		int myNum=5;		//integer
		float myFloatNum=5.99f;		//floating point number
		char myLetter='D';			//character
		String myText="Hello";		//string
		boolean myBool=true;		//boolean
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myText);
		System.out.println(myBool);
		
		//Create variables of different datatypes
		int items=50;
		float costPerItem=9.99f;
		float totalCost=items*costPerItem;
		char currency='$';
		//Print variables
		System.out.println("Number of items : "+items);
		System.out.println("Cost per item :"+costPerItem);
		System.out.println("Total cost : "+totalCost+currency);
	}

}
