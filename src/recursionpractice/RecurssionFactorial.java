package recursionpractice;
import java.util.*;
public class RecurssionFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number:");
		int n=scan.nextInt();
		System.out.println("factorial:"+findFactorial(n));

	}
	public static int findFactorial(int n) {
		if(n==1) {
			return 1;
		}
		return n*findFactorial(n-1);
	}

}
