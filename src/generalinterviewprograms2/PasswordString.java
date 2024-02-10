package generalinterviewprograms2;
import java.util.Scanner;

public class PasswordString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        String s=scan.nextLine();
        checkPassword(n,s);
        
    }

    public static void checkPassword(int n,String s) {
        // Your existing code for checking the password goes here
    	int l=0,u=0,d=0,sp=0;
    	int count=0;
    	if(s.length()>=6) {
    		char[] ch=s.toCharArray();
    		for(int i=0;i<ch.length;i++) {
    			if(ch[i]>='a'&& ch[i]<='z') {
    				l++;	
    			}
    			else if(ch[i]>='A' && ch[i]<='Z') {
    				u++;
    			}
    			else if(ch[i]>='0' && ch[i]<='9') {
    				d++;
    			}
    			else if(ch[i]=='!' || ch[i]=='@'|| ch[i]=='#'|| ch[i]=='$'||ch[i]=='%'|| ch[i]=='^'||ch[i]=='&'||ch[i]=='*'||ch[i]=='('||ch[i]==')'||ch[i]=='-'||ch[i]=='+') {
    			   sp++;
    			}
    		}
//    		System.out.println(l);
//    		System.out.println(u);
//    		System.out.println(d);
//    		System.out.println(sp);
    		if(l>0) {
    			count++;
    		}
    		if(u>0) {
    			count++;
    		}
    		if(d>0) {
    			count++;
    		}
    		if(sp>0) {
    			count++;
    		}
    		if(count==4) {
    			System.out.println("Strong");
    		}
    		else {
    			System.out.println(4-count);
    		}
    	}
    	else {
    		System.out.println(6-n);
    	}
    }
}
