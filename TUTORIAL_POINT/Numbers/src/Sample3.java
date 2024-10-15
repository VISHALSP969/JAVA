
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
		Integer p=Integer.valueOf(9);
		System.out.println(p);
		Double q=Double.valueOf(9);
		System.out.println(q);
		String r=String.valueOf("9");
		System.out.println(r);
		Integer i=Integer.valueOf("444",16);
		System.out.println(i);
		System.out.println("-----------");
		System.out.println(x.toString());
		System.out.println(Integer.toString(12));
		System.out.println("-----------");
		System.out.println(Integer.parseInt("99"));
		System.out.println(Integer.parseInt("5"));
		System.out.println(Integer.parseInt("444",16));
		System.out.println("-----------");
		
	}
}
