package generalinterviewprograms;

import java.util.Scanner;

public class PrimeNumbersBetweenTwoNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		int sum=0;
		for(int i=a;i<=b;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;			
				}
			}
			if(count==2 || count==1) {
				sum++;
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		System.out.println("The number of prime numbers are : "+sum);

	}


}
