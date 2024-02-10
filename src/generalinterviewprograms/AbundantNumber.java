package generalinterviewprograms;
import java.util.*;
//An Abundant number or excessive number is a number for which the sum of its proper
// divisions is greater than the number
public class AbundantNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=scan.nextInt();
		boolean res=Abundant.detectAbundant(num);
		if(res==true) {
			System.out.println("enter number "+num+" is abundant");
		}
		else {
			System.out.println("enter number "+num+" is deficient");
		}
	}
	class Abundant{
		static boolean detectAbundant(int num) {
			int sum=0;
			for(int i=1;i<num;i++) {
				if(num%i==0) {
					sum=sum+i;
				}
			}
			if(sum>num) {
				return true;
			}
			else {
				return false;
			}
		}
	}

}
