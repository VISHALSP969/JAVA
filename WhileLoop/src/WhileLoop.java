
public class WhileLoop {

	public static void main(String[] args) {
		int i=0;
		while(i<5) {
			System.out.println(i);
			i++;
		}
		System.out.println("---------------");
		
		int countDown=3;
		while(countDown>0) {
			System.out.println(countDown);
			countDown--;
		}
		System.out.println("Happy New Year!!");
		System.out.println("---------------");
		
		int dice=1;
		while(dice<=6) {
			if(dice<6) {
				System.out.println("No Yatzy.");
			} else {
			System.out.println("Yatzy!");
			}
			dice=dice+1;
		}
		
	}

}
