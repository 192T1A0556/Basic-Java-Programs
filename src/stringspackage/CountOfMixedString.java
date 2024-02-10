package stringspackage;

import java.util.Scanner;

public class CountOfMixedString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string:");
		String s=scan.nextLine();
		int alphabets=0;
		int Vowels=0;
		int consonants=0;
		int Digits=0;
	    int Others=0;
	    for(int i=0;i<s.length();i++) {
	    	char temp=s.charAt(i);
	    	//alpbhabets
	    	if((temp>='a' && temp<='z')||(temp>='A' && temp<='Z')) {
	    		alphabets++;
	    		//vowels & consonants
	    		if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'||temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U') {
	    			Vowels++;
	    		}
	    		else {
	    			consonants++;
	    		}
	    	}
	    	else if(temp>='0'&& temp<='9') {
	    		Digits++;
	    	}
	    	else {
	    		Others++;
	    	}
	    	
	    }
	    System.out.println(alphabets);
	    System.out.println(Vowels);
		System.out.println(consonants);
		System.out.println(Digits);
		System.out.println(Others);
		

	}

}
