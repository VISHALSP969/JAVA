
public class IfElse1 {

	public static void main(String[] args) {
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		
		//conditional operator
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
	}
}
