package generalinterviewprograms;

import java.util.Scanner;

public class SeriesOfNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.print("1+");
		for(int i=2;i<=n;i++) {
			System.out.print("1/"+(i*i));
			if(i<n) {
				System.out.print("+");
			}
		}

	}


}
