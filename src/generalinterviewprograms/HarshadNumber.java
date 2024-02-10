package generalinterviewprograms;
import java.util.*;
//A number is said to ba the Harshad number i it is divisible by the sum of its digit.
//156=1+5+6=12 and 156/12==0 so harshad number
public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		boolean res=Harshad.detectHarshad(num);
		if(res==true) {
			System.out.println("entred number "+num+" is Harshad");
		}
		else {
			System.out.println("entred number "+num+" not Harshad");
		}

	}
	class Harshad{
		static boolean detectHarshad(int num) {
		int original=num;
		int sum=0;
		int digit=0;
		while(num!=0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		if(original%sum==0) {
			return true;
		}
		else {
			return false;
		}
	}
	}

}
