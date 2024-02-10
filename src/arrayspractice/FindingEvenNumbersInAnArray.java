package arrayspractice;

import java.util.Scanner;

public class FindingEvenNumbersInAnArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("please enter the array element at index:"+i);
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("The even numbers in an array are:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}


}
