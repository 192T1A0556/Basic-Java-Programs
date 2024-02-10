package generalinterviewprograms;
import java.util.*;
//A number is said to be a perfect number if the sum of factors of the input
//number is equal to the same input number 6=1+2+3.
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=scan.nextInt();
		int res=perfect.detectPerfect(num);
		if(num==res) {
			System.out.println("entered number "+num+" is perfect number");
		}
		else {
			System.out.println("entered number "+num+" is not perfect number");
		}
	}
	class perfect{
		static int detectPerfect(int num) {
			int sum=0;
			for(int i=1;i<num;i++) {
				if(num%i==0) {
					sum=sum+i;
				}
			}
			return sum;
		}
	}
}
