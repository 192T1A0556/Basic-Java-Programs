package multiThreading;
import java.util.*;
public class CalculatorApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		AddThread at=new AddThread(c);
		SubThread st=new SubThread(c);
		MulThread mt=new MulThread(c);
		DivThread dt=new DivThread(c);
		at.start();
		st.start();
		mt.start();
		dt.start();
	}

}
class Calculator{
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
class AddThread extends Thread{
	Calculator calc;
	public AddThread(Calculator calc) {
		this.calc=calc;
	}
	public void run() {
		calc.add();
	}
}
class SubThread extends Thread{
	Calculator calc;
	public SubThread(Calculator calc) {
		this.calc=calc;
	}
	public void run() {
		calc.sub();
	}
}
class MulThread extends Thread{
	Calculator calc;
	public MulThread(Calculator calc) {
		this.calc=calc;
	}
	public void run() {
		calc.mul();
	}
}
class DivThread extends Thread{
	Calculator calc;
	public DivThread(Calculator calc) {
		this.calc=calc;
	}
	public void run() {
		calc.div();
	}
}
