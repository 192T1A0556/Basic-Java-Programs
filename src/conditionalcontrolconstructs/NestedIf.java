package conditionalcontrolconstructs;
import java.util.*;
public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter yop");
		int yop=sc.nextInt();
		System.out.println("please enter marks");
		int marks=sc.nextInt();
		if(yop>2021) {
			if(marks>70) {
				System.out.println("Eligible");
			}
			else {
				System.out.println("Not Eligible marks<=70");
			}
		}
		else 
		{
			System.out.println("Not Eligible year<=2021");
		}

	}

}
