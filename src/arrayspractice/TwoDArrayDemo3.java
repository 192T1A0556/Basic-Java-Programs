package arrayspractice;

import java.util.Scanner;

public class TwoDArrayDemo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter number of rows: ");
		int row=scan.nextInt();
		System.out.println("please enter number of columns: ");
		int col=scan.nextInt();
		int[][] age=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("please enter age: ");
				age[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(age[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||j==0||i==(row-1)||j==(col-1)) {
					System.out.print(age[i][j]+" ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		

	}

}
