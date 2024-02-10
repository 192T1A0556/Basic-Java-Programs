package exceptionHandling;
import java.util.*;
public class AdvantageOfHavingMultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		catch(NegativeArraySizeException e1) {
			System.out.println("please enter positive array size");
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("please enter an index less than array size");
		}
		catch(InputMismatchException e3) {
			System.out.println("please enter only integer values");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
