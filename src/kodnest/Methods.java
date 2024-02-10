package kodnest;
//public class Methods{
    //No Arguments No Returntype Methods
//	public static void wish() {
//		System.out.println("GOOD AFTERNOON TO ALL!");
//	}
//	public static void main(String[] args) {
//		System.out.println("Method 1 of no arguments and no return type");
//		wish();
//	}
//}
//public class Methods{
    //No Arguments with ReturnType Methods
//	public static int findsum() {
//		int a=10;
//		int b=5;
//		int c=a+b;
//		return c;
//	}
//	public static void main(String[] args) {
//		System.out.println("Method2 of no arguments with returntype");
//		int res=findsum();
//		System.out.println("result:"+res);
//	}
//}
//public class Methods{
    //Arguments No ReturnType Methods
//	public static void study(int hours,String subject) {
//		System.out.println("i will study this subject:"+subject);
//		System.out.println("on these many hours:"+hours);
//	}
//	public static void main(String[] args) {
//		System.out.println("Method3 of arguments with no returntype");
//		study(3,"java");
//	}
//}
//public class Methods{
    //Arguments with ReturnType Methods
//	public static double simpleIntrest(int p,double r,int t) {
//		double res=p*r*t/100;
//		return res;
//	}
//	public static void main(String[] args) {
//		System.out.println("Method3 of with arguments and with returntype");
//		double s=simpleIntrest(1500,7.5,3);
//		System.out.println("Result is:"+s);
//	}
//}
public class Methods{
	public static int multiply(int a,int b) {
		int p=a*b;
		return p;
	}
	public static void main(String[] args) {
		int res=multiply(10,5);
		System.out.println("product="+res);
	}
}