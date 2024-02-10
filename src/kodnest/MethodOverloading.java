package kodnest;
//class DisneyBakery{
//	public static void serveTea() {
//		System.out.println("INR 10");
//	}
//	public static void serveTea(int cups) {
//		int INR=cups*10;
//		System.out.println("INR"+INR);
//	}
//	public static void serveTea(String type) {
//		System.out.println("INR 20");
//	}
//	public static void serveTea(int cups,String type) {
//		int INR=cups*20;
//		System.out.println("INR"+INR);
//	}
//}
//
//public class MethodOverloading {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		DisneyBakery.serveTea();
//		DisneyBakery.serveTea(3);
//		DisneyBakery.serveTea("green tea");
//		DisneyBakery.serveTea(3,"lemon tea");
//	}
//
//}
         //EXAMPLE 2//
class Addition{
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
public class MethodOverloading{
	public static void main(String[] args) {
		Addition.add(10.5,5);
		Addition.add(7,4.5);
		Addition.add(10.5,10.5,10.5);
		Addition.add(3,6,6);
		Addition.add(5.8,3.0);
		Addition.add(3,7);
	}
	
}