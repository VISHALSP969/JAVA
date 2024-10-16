
public class Sample6 {

	public static void main(String[] args) {
		float f=2.34f;
		int i=100;
		String str="sample";
		System.out.printf("The value of float variable is "+"%f, while the value of integer "+"variable is %d, and the string "+"is \'%s\'",f,i,str);
		System.out.println();
		String fs;
		fs=String.format("The value of float variable is "+"%f, while the value of integer "+"variable is %d, and the string "+"is \'%s\'",f,i,str);
		System.out.println(fs);
	}
}
