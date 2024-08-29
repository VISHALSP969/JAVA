
public class TypeCasting {

	public static void main(String[] args) {
		//Widening casting
		int myInt=9;
		double myDouble=myInt;	//Automatic casting into double
		
		System.out.println(myInt);
		System.out.println(myDouble);
		
		//Narrowing casting
		myDouble=9.78;
		myInt=(int)myDouble;
		
		System.out.println(myDouble);
		System.out.println(myInt);
		
		int maxScore=500;
		int userScore=423;
		float percentage=(float)userScore/maxScore*100.0f;
		System.out.println(percentage);
	}

}
