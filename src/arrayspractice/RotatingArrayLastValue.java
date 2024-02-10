package arrayspractice;

import java.util.Scanner;

public class RotatingArrayLastValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter size of array:");
		int size=scan.nextInt();
		//array creation
		int[] arr=new int[size];
		//array input
		for(int i=0;i<size;i++) {
			System.out.println("please enter element for index: "+i);
			arr[i]=scan.nextInt();
		}
		int temp=arr[arr.length-1];
		System.out.println(temp);
		for(int i=arr.length-1;i>=1;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		//printing array
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
