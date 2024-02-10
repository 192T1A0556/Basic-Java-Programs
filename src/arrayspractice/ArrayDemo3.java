package arrayspractice;
import java.util.*;
public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=scan.nextInt();
		//array creation
		String[] names=new String[size];
		//taking string input followed by integer input
		scan.nextLine();
		//arrayinput
		for(int i=0;i<=names.length;i++) {
			System.out.println("please enter names for idx "+i);
			names[i]=scan.nextLine();
		}
		//array output
		for(int i=0;i<names.length;i++) {
			System.out.println("names for idx "+i+"= "+names[i]);
		}
		

	}

}
