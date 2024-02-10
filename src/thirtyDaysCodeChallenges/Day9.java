package thirtyDaysCodeChallenges;
import java.util.*;
public class Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int r=0;
		while(n>=1) {
			int n1=n%2;//1
//			System.out.println("rem:"+n1);
			int n2=n/2;//2
//			System.out.println("quo:"+n2);
			int n3=n2*2;//4
//			System.out.println("nxt number:"+n3);
			if(n3!=n) {
//				System.out.println("r++");
				r++;
			}
			n=n2;
//			System.out.println("====");
		}

       System.out.println(r);

	}

}
