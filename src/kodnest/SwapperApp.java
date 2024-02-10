package kodnest;
import java.util.Scanner;
class Swapper{
	public static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a);
		System.out.println("b="+b);	
	}
}
public class SwapperApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scan =new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=scan.nextInt();
		System.out.println("Enter second number:");
		int b=scan.nextInt();
		Swapper.swap(a,b);
	}
}
