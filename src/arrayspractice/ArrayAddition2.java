package arrayspractice;

import java.util.Scanner;

public class ArrayAddition2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter number of rows:");
		int row=scan.nextInt();
		System.out.println("please enter number of columns:");
		int col=scan.nextInt();
		//array creation
		int[][] a=new int[row][col];
		int[][] b=new int[row][col];
		int[][] sum=new int[row][col];
		//array input
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				//input for 1st array
				System.out.println("please enter element for a index:"+i+j);
				a[i][j]=scan.nextInt();
				//input for 2nd array
				System.out.println("please enter element for b index:"+i+j);
				b[i][j]=scan.nextInt();
			}
		}
		//adding and printing sum array
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}

	}


}
