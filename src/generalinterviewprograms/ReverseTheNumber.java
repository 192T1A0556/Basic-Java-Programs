package generalinterviewprograms;

import java.util.Scanner;

public class ReverseTheNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int rev=0;
		int prod=1;
		while(num>0) {
			int rem=num%10;
		    num=num/10;
		    rev=rev*10+rem;
		    prod*=rem;
		}
		System.out.println("The reverse number is : "+rev);
		System.out.println(prod);
	}

}
