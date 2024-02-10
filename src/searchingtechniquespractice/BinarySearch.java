package searchingtechniquespractice;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=scan.nextInt();
		//array craetion
		int[] arr=new int[size];
		//array input
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter value for index:"+i);
			arr[i]=scan.nextInt();
		}
		//array output
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("please enter key to search:");
		int key=scan.nextInt();
		//binary search
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		while(low<=high) {
			if(key==arr[mid]) {
				System.out.println("key found");
				return;
			}
			else if(key<arr[mid]) {
				high=mid-1;
				mid=(low+high)/2;
			}
			else if(key>arr[mid]) {
				low=mid+1;
				mid=(low+high)/2;
			}
			
		}
		System.out.println("key not found");

	}

}
