package collectionsFrameWork;
import java.util.*;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it allows only homogenous data because it compares the data
		//if we try to insert heterogenous data it gives run time exception as ClassCastException
		//it is useful when we want the priority element at the top i.e smallest element
		//it uses minheapdatastructure
		PriorityQueue pq1=new PriorityQueue();
		pq1.add(30);
		pq1.add(20);
		pq1.add(40);
		pq1.add(10);
		System.out.println(pq1);
		
		PriorityQueue pq2=new PriorityQueue();
		pq2.add("rahul");
		pq2.add("amit");
		pq2.add("suresh");
		pq2.add("harash");
		System.out.println(pq2);

	}

}

