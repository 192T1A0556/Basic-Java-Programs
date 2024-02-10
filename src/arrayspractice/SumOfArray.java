package arrayspractice;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("please enter element for index of "+i);
			arr[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("The sum of all the elemnts present in an array is:"+sum);
		

	}

}
