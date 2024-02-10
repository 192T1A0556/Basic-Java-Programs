package sortingtechniquespractice;

import java.util.Scanner;

public class SelectionSort {
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
		//selection sort logic for ascending order logic
		for(int i=0;i<arr.length;i++) {
			int smallest=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[smallest];
			arr[smallest]=temp;
		}
		//array output
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//selection sort logic for decending oder logic
		for(int i=0;i<arr.length;i++) {
			int biggest=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[biggest]<arr[j]) {
					biggest=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[biggest];
			arr[biggest]=temp;
		}
		//array output
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}
