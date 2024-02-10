package exceptionHandling;
import java.util.*;
public class HandlingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program is strating");
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
//			e.printStackTrace();
			System.out.println("Exception was handled");
		}
		System.out.println("program is terminating");

	}

}
