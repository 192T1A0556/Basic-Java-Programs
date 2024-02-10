package kodnest;

//public class UnaryOperators {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("post increment");
//		int a=10;
//		int b=a++;
//		System.out.println("a="+a);
//		System.out.println("x="+b);
//		System.out.println("post decrement");
//		int c=10;
//		int d=c--;
//		System.out.println("c="+c);
//		System.out.println("d="+d);
//		System.out.println("pre increment");
//		int e=10;
//		int f=++e;
//		System.out.println("e="+e);
//		System.out.println("f="+f);
//		System.out.println("pre decrement");
//		int g=10;
//		int h=--g;
//		System.out.println("g="+g);
//		System.out.println("h="+h);
//	}
//
//}
class UnaryOperators{
	public static void main(String[] args) {
		int a=10;
		int b=a++ + a++ + ++a;
		System.out.println(a);
		System.out.println(b);
		int c=20;
		int d=++c +c-- + --c + --c;
		System.out.println(c);
		System.out.println(d);
		int e=5;
		int f=++e + e + e++ + --e + e + e--;
		System.out.println(e);
		System.out.println(f);	
	}
}
