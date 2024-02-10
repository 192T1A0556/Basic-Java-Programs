package generalinterviewprograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sub=num;
		int rev=0;
		while(num>0) {
			int rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		if(sub == rev) {
			System.out.println("It is a palindrome number");
		}
		else {
			System.out.println("It is not a palindrome number");
		}


	}

}
