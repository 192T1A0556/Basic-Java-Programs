package thirtyDaysCodeChallenges;
import java.util.*;
public class Day6 {

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
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}
