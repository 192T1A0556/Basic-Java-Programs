package stringspackage;

public class StringMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="java SCRIPT";
		System.out.println("original string: "+str1);
		System.out.println("Length = "+str1.length());
		System.out.println("Upper Case = "+str1.toUpperCase());
		System.out.println("Lower Case = "+str1.toLowerCase());
		
		String str2="java script";
		System.out.println(str2.contains("java"));
		System.out.println(str2.contains("jva"));
		System.out.println(str2.contains("JAVA"));
		System.out.println(str2.contains('j'+""));
		
		String str3="java script";
		System.out.println(str3.charAt(3));
		System.out.println(str3.indexOf('s'));
		System.out.println(str3.indexOf('a'));
		System.out.println(str3.lastIndexOf('a'));
		System.out.println(str3.substring(1,6));
		System.out.println(str3.substring(3));
		
		String str4="java script is a language";
		String[] arr=str4.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}


}
