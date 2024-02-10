package kodenestAssProblems;
import java.util.*;
public class MinOrMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		//array creation
		int[] arr=new int[n];
		//array input
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int j=i+(arr.length-1);
			int sum=0;
			if(j<=arr.length) {
				for(int k=i;k<j;k++) {
					sum+=arr[k];
				}
				System.out.println(sum);
			}
			else {
				break;
			}
		}
	}

}
