package arrayspractice;
import java.util.*;
public class ArrayCopyingMechanism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of array:");
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		//Method-1
		System.out.println("using method 1");
		int[] copyArray1=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			copyArray1[i]=arr[i];
		}
		System.out.println(Arrays.toString(copyArray1));
        //Method-2
		System.out.println("using method 2");
		int[] copyArray2=new int[arr.length];
		System.arraycopy(arr, 0, copyArray2, 0, arr.length);
		System.out.println(Arrays.toString(copyArray2));
		//Method-3
		System.out.println("using method 3");
		int[] copyArray3=Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(copyArray3));
	}

}
