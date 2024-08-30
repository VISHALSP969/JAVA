
public class ForLoop {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		System.out.println("---------------");
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("---------------");
		
		for (int i = 0; i <= 100; i += 10) {
			System.out.println(i);
		} 
		System.out.println("---------------");
		
		for (int i = 0; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("---------------");
		
		int number = 2;
		// Print the multiplication table for the number 2
		for (int i = 1; i <= 10; i++) {
		  System.out.println(number + " x " + i + " = " + (number * i));
		} 
		System.out.println("---------------");
	}

}
