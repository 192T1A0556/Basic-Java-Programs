package exceptionHandling;
import java.util.*;
public class CustomOrUserDefinedException{
	public static void main(String[] args) throws UnderAgeException{
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter age");
		int age=scan.nextInt();
		applyForLicense(age);
		
	}
	public static void applyForLicense(int age) throws UnderAgeException{
		if(age>=18) {
			System.out.println("Applied for license successfully");
		}
		else {
			UnderAgeException uae=new UnderAgeException();
			throw uae;
		}
	}
}
class UnderAgeException extends Exception{
	public UnderAgeException(){
		super("you are under age ,drive a bicycle");
	}
}
