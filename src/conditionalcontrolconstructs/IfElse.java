package conditionalcontrolconstructs;
import java.util.*;
public class IfElse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter age:");
		int age=sc.nextInt();
		if(age>=18)
		{
		 System.out.println("Eligible for license");
		}
		else {
			System.out.println("Not eligible for license");
		}

	}

}
