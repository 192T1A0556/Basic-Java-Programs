package generalinterviewprograms;
import java.util.*;
public class PowerOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter base and exponent:");
		int base =scan.nextInt();
		int exponent=scan.nextInt();
		//with using inbuilt function
		int res=(int) Math.pow(base, exponent);
		System.out.println("The result:"+res);
		//without using inbuilt function
		int power=1;
		for(int i=1;i<=exponent;i++) {
			power*=base;
		}
		System.out.println("The reuslt:"+power);
		

	}

}
