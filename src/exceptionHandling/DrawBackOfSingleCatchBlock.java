package exceptionHandling;
import java.util.*;
public class DrawBackOfSingleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starting");
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("please enter size of array:");
			int size=scan.nextInt();
			int[] arr=new int[size];
			System.out.println("please enter array elements:");
			for(int i=0;i<arr.length;i++) {
				arr[i]=scan.nextInt();
			}
			System.out.println("please enter array index to access element:");
			int idx=scan.nextInt();
			System.out.println("Array element:"+arr[idx]);
		}
		catch(Exception e) {
//			e.printStackTrace();
			//even entered a -5,nine egight as string,array index out of range we are getting the same message
			System.out.println("please enter a positive array size");
			
		}
	}

}
