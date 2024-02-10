package thirtyDaysCodeChallenges;
import java.util.*;
public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
        int res=factorial(n);
        System.out.println(res);
		

	}
	public static int factorial(int i) {
		if(i>=1) {
			return i*factorial(i-1);
		}
		else {
			return 1;
		}
	}

}
