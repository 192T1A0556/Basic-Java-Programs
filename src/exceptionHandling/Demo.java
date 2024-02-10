package exceptionHandling;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program is starting");
		int Balance =15000;
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a pin:");
		int pin=scan.nextInt();
		if(pin==9876) {
			System.out.println("Balance="+Balance);
		}
		System.out.println("Program is terminating");

	}

}
