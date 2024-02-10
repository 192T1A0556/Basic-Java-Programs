package assesmentproblems;
import java.util.*;
class Number{
	int num;
	Number(int num){
		this.num=num;
	}
	boolean isPrime() {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class PrimeNumberInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number:");
		int n=scan.nextInt();
		Number res=new Number(n);
		boolean b=res.isPrime();
		if(b==true) {
			System.out.println(n+" is prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}

	}

}
