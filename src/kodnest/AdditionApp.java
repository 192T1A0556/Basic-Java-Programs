package kodnest;

public class AdditionApp{
	public static void main(String[] args) {
		Concatination.add(10.5,5);
		Concatination.add(7,4.5);
		Concatination.add(10.5,10.5,10.5);
		Concatination.add(3,6,6);
		Concatination.add(5.8,3.0);
		Concatination.add(3,7);
	}	
}
class Concatination{
	public static void add(int a,int b) {
		System.out.println("sum="+(a+b));
	}
	public static void add(double a,double b) {
		System.out.println("sum="+(a+b));
	}
	public static void add(int a,int b,int c) {
		System.out.println("sum="+(a+b+c));
	}
	public static void add(double a,double b,double c) {
		System.out.println("sum="+(a+b+c));
	}
	public static void add(int a ,double b) {
		System.out.println("sum="+(a+b));
	}
	public static void add(double a,int b) {
		System.out.println("sum="+(a+b));
	}
}
