package stringspackage;
import java.util.*;
public class BeautifulBinaryString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter length of string:");
		int n=scan.nextInt();
		scan.nextLine();
		System.out.println("please enter the string:");
		String s=scan.nextLine();
		if(s.length()==n) {
			BinaryString(s);
		}
		else {
			System.out.println("please enter the crt length of string");
		}
	
	}
	public static void BinaryString(String s) {
		String[] arr=s.split("010");
		int res=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			String c=arr[i];
			if(c.length()==1) {
			
				count++;
				res=count;
			}
		}
		System.out.println(res);
	}

}
