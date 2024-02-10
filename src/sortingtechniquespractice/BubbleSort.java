package sortingtechniquespractice;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter size of an array:");
		int size=scan.nextInt();
		//array creation
		int[] arr=new int[size];
		//array input
		for(int i=0;i<arr.length;i++) {
			System.out.println("please enter element for index:"+i);
			arr[i]=scan.nextInt();
		}
		//array output
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//bubble sort ascending order logic
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//array output
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//bubble sort decending order logic
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//array output
	    for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		}
		

	}


}
