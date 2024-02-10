package stringspackage;
import java.util.*;
public class StringEqualsToUniqueStringOrNot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a string:");
		String s=scan.nextLine();
		System.out.println(isUnique(s));
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
