package generalinterviewprograms2;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter an year:");
		int n=scan.nextInt();
		if((n%4==0 && n%100!=0) || (n%400==0)){
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not leap year");
		}

	}

}
