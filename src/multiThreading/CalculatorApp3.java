package multiThreading;

import java.util.Scanner;

public class CalculatorApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator3 c=new Calculator3();
		AddThread2 at=new AddThread2(c);
		SubThread2 st=new SubThread2(c);
		MulThread2 mt=new MulThread2(c);
		DivThread2 dt=new DivThread2(c);
		
		at.setName("add-Thread");
		st.setName("sub-Thread");
		mt.setName("mul-Thread");
		dt.setName("div-Thread");
		
		at.start();
		st.start();
		mt.start();
		dt.start();

	}

}
class Calculator3{
	Scanner scan=new Scanner(System.in);
	public synchronized void Operations() {
		String tname=Thread.currentThread().getName();
		if(tname.equals("add-Thread")) {
			add();
		}
		else if(tname.equals("sub-Thread")) {
			sub();
		}
		else if(tname.equals("mul-Thread")) {
			mul();
		}
		else {
			div();
		}
	}
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
class AddThread2 extends Thread{
	Calculator3 calc;
	public AddThread2(Calculator3 calc) {
		this.calc=calc;
	}
	public void run() {
		calc.add();
	}
}
class SubThread2 extends Thread{
	Calculator3 calc;
	public SubThread2(Calculator3 calc) {
		this.calc=calc;
	}
	public void run() {
		calc.sub();
	}
}
class MulThread2 extends Thread{
	Calculator3 calc;
	public MulThread2(Calculator3 calc) {
		this.calc=calc;
	}
	public void run() {
		calc.mul();
	}
}
class DivThread2 extends Thread{
	Calculator3 calc;
	public DivThread2(Calculator3 calc) {
		this.calc=calc;
	}
	public void run() {
		calc.div();
	}
}
