package loopingcontrolconstructs;

import java.util.Scanner;

public class WhileLoopDemo2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		while(n>=1)
		{
			System.out.println(n);
			n=n/2;
		}
	}

}
