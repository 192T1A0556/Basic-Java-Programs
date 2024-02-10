package exceptionHandling;
import java.util.*;
public class UsingFinalBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("pogram is starting");
		try {
			int Balance=15000;
			Scanner scan=new Scanner(System.in);
			System.out.println("please enter a pin:");
			int pin=scan.nextInt();
			if(pin==9876) {
				System.out.println("Balance="+Balance);
			}
		}
		catch(Exception e){
			System.out.println("Exception was handled");
			System.out.println("catch block was exevuted");
		}
		finally {
			System.out.println("program was terminating");
			System.out.println("finally block was executed");
		}
	}
}
		

	


