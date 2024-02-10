package searchingtechniquespractice;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of an array;");
		int n=scan.nextInt();
		System.out.println("enter key to search:");
		int key=scan.nextInt();
		//array//creation
		int[] arr=new int[n];
		//arrayinput
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		//array output
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	    linearSearch(arr,key);

	}
	public static void linearSearch(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("key found");
				return;
			}
		}
		System.out.println("key not found");
		
	}

}
