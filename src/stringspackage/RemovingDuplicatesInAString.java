package stringspackage;
import java.util.*;
public class RemovingDuplicatesInAString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a string:");
		String s=scan.nextLine();
		String s1="";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			System.out.println(c);
			if(s1.contains(c+"")==false) {
				s1=s1+c;
			}
		}
		System.out.println(s1);

	}

}
