package generalinterviewprograms;

import java.util.Scanner;

public class FibonnaciSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
//		int a=0,b=1,sum=0;
//		int n=scan.nextInt();
//		for(int i=1;i<=n;i++) {
//			System.out.println(a+" ");
//			sum=a+b;
//			a=b;
//			b=sum;
//		}
		int a=0,b=1,show=0;
		int n=scan.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<=n;i++) {
			show=a+b;
			a=b;
			b=show;
			System.out.println(show);
		}

	}


}
