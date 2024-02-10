package arrayspractice;

import java.util.Scanner;

public class TwoDArrayDemo6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter number of rows/columns:");
		int dim=scan.nextInt();
		//array creation
		int[][] arr=new int[dim][dim];
		//array input
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("please enter element for row: "+i+" col: "+j);
				arr[i][j]=scan.nextInt();
			}
		}
		//array output
		System.out.println("original array: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if((i+j)==(dim-1)) {
					System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();;
		}

	}


}
