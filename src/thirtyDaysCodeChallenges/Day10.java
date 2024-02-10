package thirtyDaysCodeChallenges;
import java.util.*;
public class Day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//array creation
		int[][] arr=new int[6][6];
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		int max=0;
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				int row1=arr[i][j]+arr[i][j+1]+arr[i][j+2];
				int row2=arr[i+1][j+1];
				int row3=arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				int sum=row1+row2+row3;
				if(max<sum) {
					max=sum;
				}
			}
		}
		System.out.println(max);

	}

}
