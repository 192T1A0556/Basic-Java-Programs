package stringspackage;

public class StringCreationInMultipleWays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//type1
		String str1=new String("java");
		System.out.println(str1);
		//type2
		char[] ch= {'p','y','t','h','o','n'};
		String str2=new String(ch);
		System.out.println(str2);
		//type3
		String str3="html";
		System.out.println(str3);	
	}

}
