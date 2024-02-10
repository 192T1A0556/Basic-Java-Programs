package generalinterviewprograms;
import java.util.*;
//145=1!+4!+5!=145 is a strong number
public class StrongNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Strong s=new Strong();
		boolean res=s.detectString(n);
		if(res==true) {
			System.out.println("entered number "+n+" is strong number");
		}
		else {
			System.out.println("entered number "+n+" is not strong number");
		}
		
	}


}
class Strong{
	int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	boolean detectString(int num) {
		int temp=num;
		int sum=0;
		int digit=0;
		while(temp!=0) {
			digit=temp%10;
			sum=sum+fact(digit);
			temp=temp/10;
		}
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}
	}
}