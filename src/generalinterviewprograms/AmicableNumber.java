package generalinterviewprograms;
import java.util.*;
//this program is not correct for example 6,28 are friendly pairs
//The amicable numbers are 2 different numbers (a pair of numbers) so related that the sum of
//the proper division (excluding the number itself) of one of the number is equal to the other
public class AmicableNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int sum1=Amicable.findsum(num1);
		int sum2=Amicable.findsum(num2);
		int res1=sum1/num1;
		int res2=sum2/num2;
		if(res1==res2) {
			System.out.println("entred number "+num1+"and"+num2+" are not friendly pairs");
		}
		else {
			System.out.println("entred numbers"+num1+"and"+num2+" are not friendly pairs");
		}

	}
	class Amicable{
		static int findsum(int num) {
			int sum=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					sum=sum+i;
				}
			}
			return sum;
		}
	}

}
