package thirtyDaysCodeChallenges;
import java.util.*;
public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String ans="";
		if(n%2!=0) {
			ans+="Weird";
		}
		else {
			if(n>=2 && n<=5) {
				ans+="Not Weird";
			}
			else if(n>=6 && n<=20) {
				ans+="Weird";
			}
			else {
				ans+="Not Weird";
			}
		}
		System.out.println(ans);
	}
	

}
