package collectionsFrameWork;
import java.util.*;
public class SortingData {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Try 1 Adding all data to treeSet");
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(50);
		al.add(40);
		al.add(30);
		System.out.println("Original List:"+al);
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.addAll(al);
		System.out.println("sorted list:"+ts);
		System.out.println("=============================");
		System.out.println("using Collections sort method");
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(50);
		al1.add(20);
		al1.add(40);
		al1.add(10);
		al1.add(30);
		System.out.println("original list:"+al1);
		Collections.sort(al1);
		System.out.println("Sorted list:"+al1);
		System.out.println("=============================");
		System.out.println("sorting objects using collections sort method in comparable interface with compareTo method");
		
	}
}
