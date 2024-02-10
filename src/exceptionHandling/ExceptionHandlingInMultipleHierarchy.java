package exceptionHandling;
import java.util.*;                                       
public class ExceptionHandlingInMultipleHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starting");
		try {
			callDiv();
		}
		catch(Exception e) {
			System.out.println("Exception handled by main()");
			
		}
	}
	public static void callDiv() {
		System.out.println("callDiv starting");
		div();
		System.out.println("callDiv terminating");
	}
	public static void div() {
		System.out.println("div starting");
		Scanner scan=new Scanner(System.in);
		System.out.println("enetr 1st number:");
		int a=scan.nextInt();
		System.out.println("enter 2nd number:");
		int b=scan.nextInt();
		int res=a/b;
		System.out.println("Division result:"+res);
		System.out.println("Div terminating");
	}

}
