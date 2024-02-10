package generalinterviewprograms2;
import java.util.*;
public class IntersectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of first array:");
		int s1=scan.nextInt();
		//array creation
		int[] arr1=new int[s1];
		//array input
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scan.nextInt();
		}
		//array output
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("enter size of second array:");
		int s2=scan.nextInt();
		//array creation
		int[] arr2=new int[s2];
		//array input
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=scan.nextInt();
		}
		//array output
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		int count=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
		int k=0;
		int[] arr3=new int[count];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					System.out.println(k);
					arr3[k]=arr2[i];
					k++;
				}
			}
		}
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();

	}

}
