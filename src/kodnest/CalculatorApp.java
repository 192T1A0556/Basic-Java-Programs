package kodnest;
import java.util.Scanner;
public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Calculator res=new Calculator();
		res.add();
		System.out.println("enter 1st number:");
		int e=scan.nextInt();
		System.out.println("enter 2nd number:");
		int f=scan.nextInt();
		res.sub(e,f);
		int prod=res.mul();
		System.out.println("product="+prod);
		System.out.println("enter 1st number:");
		int g=scan.nextInt();
		System.out.println("enter 2nd number:");
		int h=scan.nextInt();
		double div=res.div(g,h);
		System.out.println("division="+div);
	}

}
class Calculator{
	Scanner scan=new Scanner(System.in);
	//method with: no return type and no arguments
	public void add() {
		System.out.println("enter 1st number:");
		int a=scan.nextInt();
		System.out.println("enter 2nd number:");
		int b=scan.nextInt();
		int sum=a+b;
		System.out.println("sum="+sum);
	}
	//mathod with:no return type and with arguments
	public void sub(int a,int b) {
		int diff=a-b;
		System.out.println("Differece="+diff);
	}
	//method with return type and no arguments
	public int mul() {
		System.out.println("enter 1st number:");
		int c=scan.nextInt();
		System.out.println("enter 2nd number:");
		int d=scan.nextInt();
		int p=c*d;
		return p;
	}
	//method with return type and with arguments
	public double div(int a,int b) {
		double res=a/(double)b;//int/double=double
		return res;
	}
}
