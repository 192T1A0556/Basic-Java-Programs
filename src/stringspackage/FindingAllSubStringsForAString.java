package stringspackage;

import java.util.Scanner;

public class FindingAllSubStringsForAString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a string:");
		String s=scan.nextLine();
		
		for(int i=0;i<s.length();i++) {
			String s1="";
			char ch=s.charAt(i);
			for(int j=s.indexOf(ch);j<s.length();j++) {
				char ch1=s.charAt(j);
				s1=s1+ch1;
				System.out.println(s1);
			}
			
		}
		System.out.println("========================");
		for(int i=0;i<=s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				System.out.println(s.substring(i,j));			}
		}

	}


}
