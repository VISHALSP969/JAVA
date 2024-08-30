
public class Scope1 {

	public static void main(String[] args) {
		//code here cannot use x
		{//This is a block
			//code here cannot use x
			int x=100;
			//code here can use x
			System.out.println(x);
		}//block ends here
		//code cannot use x
	}

}
