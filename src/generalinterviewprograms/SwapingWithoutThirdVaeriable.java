package generalinterviewprograms;

import java.util.Scanner;

public class SwapingWithoutThirdVaeriable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("original values : a= "+a+" b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swapped values : a= "+a+" b= "+b);

	}

}
