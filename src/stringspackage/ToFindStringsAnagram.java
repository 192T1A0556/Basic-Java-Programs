package stringspackage;
import java.util.*;
public class ToFindStringsAnagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter first string:");
		String s1=scan.nextLine();
		char[] c1=s1.toCharArray();
		
		System.out.println("please enter second string:");
		String s2=scan.nextLine();
		char[] c2=s2.toCharArray();
		
		//sorting arrays using inbuilt methods of array
		Arrays.sort(c1);
		Arrays.sort(c2);
		
     	//comparing two arrays using inbuilt methods of array	
		if(Arrays.equals(c1, c2)) {
			System.out.println("strings are anagram");
		}
		else {
			System.out.println("strings are not anagram");
		}
		
	}


}
