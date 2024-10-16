
public class Sample3 {

	public static void main(String[] args) {
		// append() method
		StringBuffer sBuffer=new StringBuffer("Test");
		sBuffer.append(" String Buffer");
		System.out.println(sBuffer);
		
		// reverse() method
		StringBuffer buffer=new StringBuffer("Game Plan");
		System.out.println(buffer.reverse());
		
		// delete() method
		StringBuffer sb=new StringBuffer("abcdefghijk");
		sb.delete(3,7);
		System.out.println(sb);
		
		// insert() method
		StringBuffer sb1=new StringBuffer("abcdefghijk");
		sb1.insert(3,"123");
		System.out.println(sb1);
		
		// replace() method
		StringBuffer sb2=new StringBuffer("abcdefghijk");
		sb2.replace(3,7,"ZARA");
		System.out.println(sb2);
		sb2.replace(3,8,"ZARA");
		System.out.println(sb2);
		
		System.out.println(sb.capacity());
	}
}
