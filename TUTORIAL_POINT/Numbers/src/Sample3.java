
public class Sample3 {

	public static void main(String[] args) {
		Integer x=5;
		Integer y=10;
		Integer z=5;
		Short a=5;
		System.out.println(x.byteValue());
		System.out.println(x.shortValue());
		System.out.println(x.intValue());
		System.out.println(x.longValue());
		System.out.println(x.floatValue());
		System.out.println(x.doubleValue());
		System.out.println("-----------");
		System.out.println(x.compareTo(3));	
		System.out.println(x.compareTo(4));
		System.out.println(x.compareTo(5));
		System.out.println(x.compareTo(6));
		System.out.println(x.compareTo(7));
		System.out.println("-----------");
		System.out.println(x.equals(y));
		System.out.println(x.equals(z));
		System.out.println(x.equals(a));
		System.out.println("-----------");
	}
}
