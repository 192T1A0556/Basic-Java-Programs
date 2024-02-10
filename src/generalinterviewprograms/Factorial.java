package generalinterviewprograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int fact=1;
		for(int i=a;i>=1;i--) {
			fact*=i;
		}
		System.out.println("The Factorial of "+a+" is :"+fact);
		

	}


}
