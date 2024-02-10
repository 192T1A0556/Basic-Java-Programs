package multiThreading;

import java.util.Scanner;

public class CalculatorApp2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Calculator2 c=new Calculator2();
		AddThread1 at=new AddThread1(c);
		SubThread1 st=new SubThread1(c);
		MulThread1 mt=new MulThread1(c);
		DivThread1 dt=new DivThread1(c);
		
		at.start();
		at.join();
		
		st.start();
		st.join();
		
		mt.start();
		mt.join();
		
		dt.start();
		dt.join();

	}

}
class Calculator2{
	Scanner scan=new Scanner(System.in);
	public void add() {
		System.out.println("enter 1st number:");
		int num1=scan.nextInt();
		System.out.println("enter 2nd number:");
		int num2=scan.nextInt();
		int sum=num1+num2;
		System.out.println("sum="+sum);
	}
	public void sub() {
		System.out.println("enter 1st number:");
		int num1=scan.nextInt();
		System.out.println("enter 2nd number:");
		int num2=scan.nextInt();
		int sub=num1-num2;
		System.out.println("sub="+sub);
	}
	public void mul() {
		System.out.println("enter 1st number:");
		int num1=scan.nextInt();
		System.out.println("enter 2nd number:");
		int num2=scan.nextInt();
		int mul=num1*num2;
		System.out.println("mul="+mul);
	}
	public void div() {
		System.out.println("enter 1st number:");
		int num1=scan.nextInt();
		System.out.println("enter 2nd number:");
		int num2=scan.nextInt();
		double div=(double) num1/num2;
		System.out.println("div="+div);
	}
}
class AddThread1 extends Thread{
	Calculator2 calc;
	public AddThread1(Calculator2 calc) {
		this.calc=calc;
	}
	public void run() {
		calc.add();
	}
}
class SubThread1 extends Thread{
	Calculator2 calc;
	public SubThread1(Calculator2 calc) {
		this.calc=calc;
	}
	public void run() {
		calc.sub();
	}
}
class MulThread1 extends Thread{
	Calculator2 calc;
	public MulThread1(Calculator2 calc) {
		this.calc=calc;
	}
	public void run() {
		calc.mul();
	}
}
class DivThread1 extends Thread{
	Calculator2 calc;
	public DivThread1(Calculator2 calc) {
		this.calc=calc;
	}
	public void run() {
		calc.div();
	}
}

