package exceptionHandling;
import java.util.*;
public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shop();
	}
	public static void shop() {
		try {
			pay();
			System.out.println("Thankyou for shopping");
		}
		catch(Exception e) {
			System.out.println("Shopping not completed try again");
			System.out.println("Exception info received by shop");
		}
	}
	public static void pay() {
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("please enter amount:");
			int amt=scan.nextInt();
			System.out.println("payment successful-INR"+amt);
		}
		catch(Exception e) {
			System.out.println("payment not completed");
			System.out.println("Exception handled by pay()");
			throw e;
		}
	}

}
