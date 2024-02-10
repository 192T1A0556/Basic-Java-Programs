package loopingcontrolconstructs;
import java.util.*;
public class DoWhileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number:");
		int n=scan.nextInt();
		int i=1;
		int fact=1;
		do {
			fact=fact*i;
			i++;
		}while(i<=4);
		System.out.println("factorial="+fact);
		
		

	}

}
