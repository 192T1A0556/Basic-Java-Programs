package generalinterviewprograms2;
import java.util.*;
public class FibonacciTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number:");
		int n=scan.nextInt();
		for(int i=0;i<=n;i++) {
			fibonacci(i);
		}
	}
	public static void fibonacci(int n) {
		int a=0;
		int b=1;
		int sum=0;
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;	
		}
		System.out.println();
	}

}
