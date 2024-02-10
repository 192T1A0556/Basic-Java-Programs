package kodnest;
import java.util.Scanner;
public class PracticeApp1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result=Test.isGraduate();
		System.out.println(result);
	}
}
class Test{
	public static boolean isGraduate() 
	{
		boolean graduate;
		Scanner  scan = new Scanner(System.in);
		System.out.println("please enter wheather you are graduate or not");
		graduate=scan.nextBoolean();
		return graduate;		
	}
}
