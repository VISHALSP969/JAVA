
public class Arrays {

	public static void main(String[] args) {
		String[] cars= {"Volvo","BMW","Ford","Mazda"};
		
		//Access array elements
		System.out.println(cars[0]);
		
		//Change array elements
		cars[0] = "Opel";
		System.out.println(cars[0]);
		
		//Array length
		System.out.println(cars.length);
		System.out.println("---------------");
		
		//Arrays loop
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("---------------");
		
		for (String i : cars) {
			System.out.println(i);
		}
		
	}

}
