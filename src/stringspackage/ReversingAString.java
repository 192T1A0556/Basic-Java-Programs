package stringspackage;

import java.util.Scanner;

public class ReversingAString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//way1
//		String s="kodnest";
//		char[] c=s.toCharArray();//inbuilt method
//		String rev="";
//		for(int i=c.length-1;i>=0;i--) {
//			rev=rev+c[i];
//		}
//		System.out.println(rev);
//		
		//way2
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a string:");
		String s1=scan.nextLine();
		System.out.println("original array:"+s1);
		String rev1="";
		for(int i=s1.length()-1;i>=0;i--) {//using length() and charAt() inbuilt methods
			rev1=rev1+s1.charAt(i);
		}
		System.out.println("reversed string:"+rev1);
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==rev1.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
		
		//way3
		//Scanner scan=new Scanner(System.in);
//		System.out.println("please enter a string:");
//		String s2=scan.nextLine();
//		System.out.println("original array:"+s2);
//		
//		StringBuffer sb=new StringBuffer(s2);//using buffer class
//		StringBuffer rev2=sb.reverse();//using reverse() inbuilt method from buffer class
//		
//		System.out.println("reversed string:"+rev2);
//		
	}

}
