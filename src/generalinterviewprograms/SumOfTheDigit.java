package generalinterviewprograms;

import java.util.Scanner;

public class SumOfTheDigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum=0;
		while(num>0) {
			int rem=num%10;
			num=num/10;
			sum+=rem;			
		}
		System.out.println(sum);
	}

}
