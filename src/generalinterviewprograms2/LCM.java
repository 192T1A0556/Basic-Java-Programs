package generalinterviewprograms2;
import java.util.*;
public class LCM {

	public static void main(String[] args) {
		// TODO Aut    o-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter first number:");
		int a=scan.nextInt();
		System.out.println("please enter second number:");
		int b=scan.nextInt();
		System.out.println(gcd(a,b));
		int res=(a*b)/gcd(a,b);
		System.out.println("The Lcm of two numbers:"+res);
	}
	public static int gcd(int a,int b) {
		int result=Math.min(a, b);
		int b1=0;
		while(result>0) {
			if(a%result==0 && b%result==0) {
				b1=result;
				break;
			}
			result--;
		}
		return b1;
	}

}
