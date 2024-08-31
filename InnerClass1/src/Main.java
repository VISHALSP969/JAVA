class OuterClass{
	int x=10;
	//private inner class
	private class InnerClass{
		int y=5;
	}
}

public class Main {

	public static void main(String[] args) {
		OuterClass myOuter=new OuterClass();
		OuterClass.InnerClass myInner=myOuter.new Innerclass();		//error-InnerClass can't access out of OuterClass
		System.out.println(myInner.y+"  "+myOuter.x);
	}
}
