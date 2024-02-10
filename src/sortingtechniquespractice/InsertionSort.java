package sortingtechniquespractice;
import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter size of an array:");
		int n=scan.nextInt();
		//array creation
		int[] arr=new int[n];
		//array input
		for(int i=0;i<arr.length;i++) {
			System.out.println("please enter array index:"+i);
			arr[i]=scan.nextInt();
		}
		//array output
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//insertion sort logic for asscending order
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		//array output
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//insertion sort logic for decending  order
	   for(int i=1;i<arr.length;i++) {
			int key=arr[i];
		    int j=i-1;
		    while(j>=0 && arr[j]<key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		//array output
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();		
		
			

	}

}
