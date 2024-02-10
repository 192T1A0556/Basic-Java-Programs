package thirtyDaysCodeChallenges;
import java.util.*;
public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<n;i++) {
			String s=scan.nextLine();
			String eve="";
			String odd="";
			for(int j=0;j<s.length();j++) {
				if(j%2==0) {
					eve+=s.charAt(j);
				}
				else {
					odd+=s.charAt(j);
				}
			}
			System.out.println(eve+" "+odd);
		}

	}

}
