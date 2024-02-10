package generalinterviewprograms;

import java.util.Scanner;

public class FindingFactors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("The toatal no of factors for "+a+":"+count);

	}

}
