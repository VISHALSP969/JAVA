
public class Sample2 {
	char  test(char ch) {
		return ch;
	}
	public static void main(String[] args) {
		Sample2 obj=new Sample2();
		
		// Here following primitive Character object ch
		// is boxed into the Character object ch
		Character ch='a';
		
		//Here primitive 'x' is boxed for method test,
		// return is unboxed to char 'c'
		char c=obj.test('x');
		System.out.println(c);
	}
}
