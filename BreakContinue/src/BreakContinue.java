
public class BreakContinue {

	public static void main(String[] args) {
		//break
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("---------------");
		
		int i = 0;
		while (i < 10) {
		  System.out.println(i);
		  i++;
		  if (i == 4) {
		    break;
		  }
		}
		System.out.println("---------------");
		
		//continue
		for (int j = 0;  j< 10; j++) {
			if (j == 4) {
				continue;
			}
			System.out.println(j);
		}
		System.out.println("---------------");
		
		int j = 0;
		while (j < 10) {
		  if (j == 4) {
		    j++;
		    continue;
		  }
		  System.out.println(j);
		  j++;
		}
		System.out.println("---------------");		
	}

}
