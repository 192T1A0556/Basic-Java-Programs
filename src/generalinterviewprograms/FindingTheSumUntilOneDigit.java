package generalinterviewprograms;

import java.util.Scanner;

public class FindingTheSumUntilOneDigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int res=sum(a);
		while(res>=10) {
			System.out.println(res);
			res=sum(res);
		}
		System.out.println(res);
	}
	public static int sum(int a) {
		int count=0;
		while(a>0) {
			int rem=a%10;
			a=a/10;
			count+=rem;
		}
		return count;
		
	}


}
