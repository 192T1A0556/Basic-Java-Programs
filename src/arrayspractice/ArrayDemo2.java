package arrayspractice;

import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter size of an array:");
		int size=scan.nextInt();
		int[] marks=new int[size];
		for(int i=0;i<marks.length;i++) {
			System.out.println("please enter value for index of "+i);
			marks[i]=scan.nextInt();
		}
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		

	}

}
