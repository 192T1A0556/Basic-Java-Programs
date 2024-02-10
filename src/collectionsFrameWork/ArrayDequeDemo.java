package collectionsFrameWork;
import java.util.*;
public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arraydeque allows heterogenous data
		//add(),addFirst,addLast
		//ArrayDeque internally allows DoublyEndedQueue DataStructure
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(9.99);
		ad.add(false);
		System.out.println(ad);
		ad.addFirst("first");
		ad.addLast("last");
		System.out.println(ad);

	}

}
