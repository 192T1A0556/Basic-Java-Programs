package arrayspractice;

import java.util.Scanner;

public class JaggedArray2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		int[][] m=new int[3][];
		m[0]=new int[3];
		m[1]=new int[4];
		m[2]=new int[2];
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.println("please enter marks for row "+i+"column "+j);
				m[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}

	}

}
