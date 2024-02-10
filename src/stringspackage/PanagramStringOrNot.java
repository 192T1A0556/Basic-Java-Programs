package stringspackage;
import java.util.*;
public class PanagramStringOrNot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter panagram string:");
		String s=scan.nextLine();
		for(char i='a';i<='z';i++) {
			if(s.contains(i+"")==false) {
				System.out.println("not a panagram");
				return;
			}
		}
		System.out.println("panagram");//a quick brown fox jumps over the lazy dog
		

	}


}
