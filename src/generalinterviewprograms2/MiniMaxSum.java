package generalinterviewprograms2;
import java.util.*;
public class MiniMaxSum {

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
		//array output
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			int r=i+(n-1);
			if(r<=arr.length) {
				for(int j=i;j<r;j++) {
					sum+=arr[j];
				}
				System.out.print(sum+" ");
			}
		}
		System.out.println();
	}

}
