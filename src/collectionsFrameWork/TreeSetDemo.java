package collectionsFrameWork;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//treeset class internally uses red-black tree datastructure which is a self balancing binary tree
		//treeset used when we want data in sorted order
		//we must add homogenous data else it gives runtime error as classcastexception
		TreeSet ts1=new TreeSet();
		ts1.add(40);
		ts1.add(20);
		ts1.add(10);
		ts1.add(30);
		System.out.println(ts1);
		TreeSet ts2=new TreeSet();
		ts2.add("red");
		ts2.add("green");
		ts2.add("blue");
		ts2.add("black");
		System.out.println(ts2);
		

	}

}

