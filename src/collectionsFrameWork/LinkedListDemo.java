package collectionsFrameWork;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//linked list allows heterogenous data
		//linked list efficiently insert data at random position
		//add(),add(2-parameters),addFirst(),addLast()
		//peek:remove first element while printing it print the list along with removed element
		//poll && pop:remove first element while printing it wont print with removed element
		//linked list class in java implements doublyLinkedList datastructure
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add("twewnty");
		ll.add(3.3);
		System.out.println("original list:"+ll);
		System.out.println("fetching element:"+ll.get(2));
		ll.add(1,"ONE");
		System.out.println("updated list (add()):"+ll);
		ll.addFirst("first");
		ll.addLast("last");
		System.out.println("updated list (add()):"+ll);
		System.out.println(ll.peek());
		System.out.println("list after peek():"+ll);
		System.out.println(ll.poll());
		System.out.println("list after poll():"+ll);
		System.out.println("pop:"+ll.pop());
		System.out.println("list after pop():"+ll);
	}

}
