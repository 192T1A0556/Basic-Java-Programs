package stringspackage;
import java.util.*;
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] ch=A.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev=rev+ch[i];
        }
        int t=A.compareTo(rev);
        if(t>0 || t<0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        
    }

	}


