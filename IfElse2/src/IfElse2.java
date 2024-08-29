
public class IfElse2 {

	public static void main(String[] args) {
		int doorCode=1337;
		
		if(doorCode==1337) {
			System.out.println("Correct code.The door is now open.");
		}
		else {
			System.out.println("Wrong code.The door remains closed.");
		}
		
		int myNum=10;
		
		if(myNum>0) {
			System.out.println("The value is a positive number.");
		} else if(myNum<0) {
			System.out.println("The value is a negative number.");
		} else {
			System.out.println("The value is zero");
		}
		
		int myAge = 25;
		int votingAge = 18;

		if (myAge >= votingAge) {
		  System.out.println("Old enough to vote!");
		} else {
		  System.out.println("Not old enough to vote.");
		}
		
		myNum = 5;

		if (myNum % 2 == 0) {
		  System.out.println(myNum + " is even");
		} else {
		  System.out.println(myNum + " is odd");
		} 
	}

}
