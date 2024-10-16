import java.io.UnsupportedEncodingException;

public class Sample7 {

	public static void main(String[] args) {
		String s="Strings are immutable";
		char result=s.charAt(3);
		System.out.println(result);
		
		String str1="Strings are immutable";
		String str2=new String("Strings are immutable");
		String str3=new String("Integers are not immotable");
		
		int res=str1.compareTo(str2);
		System.out.println(res);
		
		res=str1.compareTo(str3);
		System.out.println(res);
		
		str1="Strings are immutable";
		str2="Strings are immutable";
		str3="Integers are not immotable";
		
		res=str1.compareTo(str2);
		System.out.println(res);
		
		res=str1.compareTo(str3);
		System.out.println(res);
		
		res=str1.compareToIgnoreCase(str2);
		System.out.println(res);
		
		res=str2.compareToIgnoreCase(str3);
		System.out.println(res);
		
		res=str3.compareToIgnoreCase(str1);
		System.out.println(res);
		
		s="Strings are immutable";
		System.out.println(s.concat(" all the time"));
		
		str1="Not immutable";
		str2="Strings are immutable";
		StringBuffer sb=new StringBuffer("Not immutable");
		boolean r=str1.contentEquals(sb);
		System.out.println(r);
		r=str2.contentEquals(sb);
		System.out.println(r);
		
		char[] charArray={'h','e','l','l','o','w','o','r','l','d'};
		str1="";
		
		str1=str1.copyValueOf(charArray);
		System.out.println(str1);
		
		str1="";
		str1=str1.copyValueOf(charArray,2,4);
		System.out.println(str1);
		
		str1="This is really not immutable";
		
		boolean retVal=str1.endsWith("immutable");
		System.out.println(retVal);
		
		str1=new String("This is really mutable");
		str2=str1;
		str3=new String("This is really not mutable");
		
		retVal=str1.equals(str2);
		System.out.println(retVal);
		
		retVal=str1.equals(str3);
		System.out.println(retVal);
		
		str1=new String("This is really not immutable");
		str2=str1;
		str3=new String("THIS IS REALLY NOT IMMUTABLE");
		
		retVal=str1.equals(str2);
		System.out.println(retVal);
		
		retVal=str1.equals(str3);
		System.out.println(retVal);
		
		retVal=str1.equalsIgnoreCase(str3);
		System.out.println(retVal);
		
		str1=new String("Welcome to Tutorialpoint.com");
		
		try {
			byte[] Str2 = str1.getBytes("UTF-8");
			System.out.println("Return value "+str2);
			
			Str2=str1.getBytes("ISO-8859-1");
			System.out.println("Return value "+str2);
			
		}
		catch(UnsupportedEncodingException e){
			System.out.println("Unsupported character set");
		}
	}
}
