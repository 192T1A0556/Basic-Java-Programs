package generalinterviewprograms;

import java.util.Scanner;

public class BeforePrimeAfterPrime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int p1=0;
		int p2=0;
		for(int i=a-1;i>=1;i--) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
					
				}
				
			}
			if(count==2) {
				System.out.println(i);
				p1=i;
				break;
			}
		}
		for(int j=a+1;j>=1;j++) {
			int count=0;
			for(int k=1;k<=j;k++) {
				if(j%k==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(j);
				p2=j;
				break;
			}
		}
		int l1=a-p1;
		int l2=p2-a;
		if(l1>l2) {
			System.out.println(p2);
		}
		else {
				System.out.println(p1);
		}

	}

}
