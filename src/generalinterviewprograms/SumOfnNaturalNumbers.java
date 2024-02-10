package generalinterviewprograms;

import java.util.Scanner;

public class SumOfnNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++) {
			sum+=i;
		}
		System.out.println(sum);
		

	}

}
