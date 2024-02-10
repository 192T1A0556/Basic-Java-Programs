package generalinterviewprograms;

import java.util.Scanner;

public class GcdOfTwoNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		while(true) {
			if(b%a==0) {
				System.out.println("gcd= "+a);
				break;
			}
			int temp=b;
			b=a;
			a=temp%a;
		}

	}

}
