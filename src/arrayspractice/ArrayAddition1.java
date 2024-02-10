package arrayspractice;

import java.util.Scanner;

public class ArrayAddition1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter size of array: ");
		int size=scan.nextInt();
		//array creation
		int[] a=new int[size];
		int[] b=new int[size];
		int[] sum=new int[size];
		//array input
		for(int i=0;i<size;i++) {
			System.out.println("please enter element for array a index "+i);
			a[i]=scan.nextInt();
			System.out.println("please enter element for array b index "+i);
			b[i]=scan.nextInt();
		}
		//adding array
		for(int i=0;i<size;i++) {
			sum[i]=a[i]+b[i];
		}
		//printing summed array
		for(int i=0;i<size;i++) {
			System.out.print(sum[i]+" ");
		}

	}

}
