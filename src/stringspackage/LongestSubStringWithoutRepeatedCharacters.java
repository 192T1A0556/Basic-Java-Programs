package stringspackage;
import java.util.*;
public class LongestSubStringWithoutRepeatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a string:");
		String s=scan.nextLine();
		int max=0;
		String y="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String temp=s.substring(i,j);
				if(isUnique(temp)==true) {
					System.out.println(temp);
					if(temp.length()>max) {
						max=temp.length();
						y=temp;
					}
				}
			}
		}
		System.out.println("The longest substring unique string is:"+max);
		System.out.println(y);

	}
	public static boolean isUnique(String s) {
		//traversing the string
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int count=0;
			for(int j=i;j<s.length();j++) {
				if(ch==s.charAt(j)) {
					count++;
				}
			}
			if(count>1) {
				return false;
			}
		}
		return true;
	}

}
