package generalinterviewprograms2;
import java.util.*;
public class DecimalToBinary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number:");
		int n=scan.nextInt();
		String s="";
		while(n>=1) {
			int n1=n%2;
			int n2=n/2;
			int n3=n2*2;
		    if(n3==n) {
		    	s+='0';
		    }
		    else {
		    	int diff=n-n3;
		    	s+=diff+"";
		    }
		    n=n2;
		}
		System.out.println(s);
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev+=ch;
		}
		System.out.println(rev);

	}

}

