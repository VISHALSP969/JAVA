
public class Sample4 {

	public static void main(String[] args) {
		System.out.println(Character.isLetter('c'));
		System.out.println(Character.isLetter('5'));
		System.out.println("----------");
		System.out.println(Character.isDigit('c'));
		System.out.println(Character.isDigit('5'));
		System.out.println("----------");
		System.out.println(Character.isWhitespace('c'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isWhitespace('\t'));
		System.out.println(Character.isWhitespace('\n'));
		System.out.println("----------");
		System.out.println(Character.isUpperCase('c'));
		System.out.println(Character.isUpperCase('C'));
		System.out.println("----------");
		System.out.println(Character.isLowerCase('c'));
		System.out.println(Character.isLowerCase('C'));
		System.out.println("----------");
		System.out.println(Character.toUpperCase('c'));
		System.out.println("----------");
		System.out.println(Character.toLowerCase('C'));
		System.out.println("----------");
		System.out.println(Character.toString('c'));
	}
}
