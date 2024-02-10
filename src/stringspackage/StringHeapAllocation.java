package stringspackage;

public class StringHeapAllocation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("java");
		String str2=new String("java");
		System.out.println(str1.equals(str2));//true
		System.out.println(str1==str2);//false
		

	}


}
