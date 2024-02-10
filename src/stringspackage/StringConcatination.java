package stringspackage;

public class StringConcatination {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in heap memory
		String str1="java";
		String str2="script";
		String str3=str1+str2;
		String str4=str1.concat(str2);
		System.out.println(str3);
		System.out.println(str4);
		//in string pool of heap memory
		String str5="java";
		String str6="script programming";
		String str7=str5+str6;
		String str8=str5.concat(str6);
		System.out.println(str7);
		System.out.println(str8);
		//other way1
		String s=new String("java");
		String s1=s.concat("script language");
		System.out.println(s1);
		
		//other way2
		String s2="hello"+"world";
		System.out.println(s2);
		
		//other way3
		String s3="java".concat("programming");
		System.out.println(s3);
	


	}

}
