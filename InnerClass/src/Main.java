class OuterClass{
	int x=10;
	class InnerClass{
		int y=5;
	}
}

public class Main {

	public static void main(String[] args) {
		//create an object of outer classs
		OuterClass myOuter=new OuterClass();
		
		//create an object of inner class
		OuterClass.InnerClass myInner=myOuter.new InnerClass();
		
		System.out.println(myInner.y+"  "+myOuter.x);
	}
}
