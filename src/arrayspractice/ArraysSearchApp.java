package arrayspractice;

import java.util.Scanner;

public class ArraysSearchApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter size of an array:");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("plaese enter the element for index:"+i);
			arr[i]=scan.nextInt();
		}
		display(arr);
		System.out.println("please enter a key to search :");
		int key=scan.nextInt();
		search(key,arr);
	}
	public static void display(int[] arr) {
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		
	}
	public static void search(int key,int[] arr) {
		for(int k=0;k<arr.length;k++) {
			if(arr[k]==key) {
				System.out.println("key found");
				return;
			}
	
		}
		System.out.println("key not found");
	}


}
