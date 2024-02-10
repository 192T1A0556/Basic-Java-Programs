package stringspackage;
import java.util.*;
public class ReverseTheStringWithTheirRespectiveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		int start =0;
		char ch[]=input.toCharArray();
		int end=ch.length-1;
		while(start<end) {
			if(ch[start]!=' '&& ch[end]!=' ') {
				char temp=ch[start];
				ch[start]=ch[end];
				ch[end]=temp;
				start++;
				end--;
			}
			else if(ch[start]==' ') {
				start++;
			}
			else if(ch[end]==' ') {
				end--;
			}
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}
}
