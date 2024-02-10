package generalinterviewprograms;

import java.util.Scanner;

public class AmStrongNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int a=num;
		int b=num;
		int res=0;
		int count=0;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			num=num/10;
			count++;
		}
		System.out.println(count);
		while(b!=0) {
			int rem=b%10;
//			res=(int)Math.pow(rem,count);
			sum+=(int)Math.pow(rem, count);
			b=b/10;
		}
		System.out.println(sum);
		if(a==sum) {
			System.out.println("AmStrong Number");
		}
		else {
			System.out.println("Not AmStrong Number");
		}
	

	}


}
