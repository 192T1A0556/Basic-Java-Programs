package arrayspractice;

import java.util.Scanner;

public class ThreeDArray2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter number of blocks:");
		int block=scan.nextInt();
		System.out.println("please enter number of rows:");
		int row=scan.nextInt();
		System.out.println("please enter number of columns");
		int col=scan.nextInt();
		scan.nextLine();
		//array creation
		String[][][] names=new String[block][row][col];
		//array input
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				for(int k=0;k<names[i][j].length;k++) {
					System.out.println("enter value for block:"+i+"row:"+j+"column:"+k);
					names[i][j][k]=scan.nextLine();
				}
			}
		}
		//array output
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				for(int k=0;k<names[i][j].length;k++) {
					System.out.print(names[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
