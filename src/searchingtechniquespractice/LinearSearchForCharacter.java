package searchingtechniquespractice;

import java.util.Scanner;

public class LinearSearchForCharacter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("eneter the size of an array:");
		int size=scan.nextInt();
		//array creation
		char[] c=new char[size];
		scan.nextLine();
		//array input
		for(int i=0;i<c.length;i++) {
			System.out.println("please enter element for index:"+i);
			c[i]=scan.nextLine().charAt(0);
		}
		System.out.println("please enter key to search:");
		char key=scan.nextLine().charAt(0);
		//linear search
		for(int i=0;i<c.length;i++) {
			if(c[i]==key) {
				System.out.println("key found");
				return;
			}
		}
		System.out.println("key not found");
	}


}
