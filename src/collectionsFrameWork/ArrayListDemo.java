package collectionsFrameWork;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arraylist allows heterogenous data
		//arraylist efficient for insert data at last index
		//get() method helps to fetch the data
		//add() method allows to insert data at last
		//add(2 parameters) allows to insert data at specified position and move on the data 
		//set(2 parameters) allows to insert data at specified position and make replace of the data at that point
		//arraylist1.add(arraylist2)adds as a array
		//arraylist1.addAll(arraylist2)copy the elements from entire array
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(3.5);
		al.add(false);
		al.add("deep");
		al.add(10);
		al.add(null);
		System.out.println("original list:"+al);
		System.out.println("data at idx2:"+al.get(2));
		al.add(2,"twoooo");
		System.out.println("updated list (add()):"+al);
		System.out.println("data at idx2:"+al.get(2));
		al.set(2, 22222);
		System.out.println("updated list(set()):"+al);
		System.out.println("data at idx2:"+al.get(2));
		
		ArrayList UiList=new ArrayList();
		UiList.add("html");
		UiList.add("css");
		UiList.add("react");
		System.out.println("UiList:"+UiList);
		System.out.println("UiList size:"+UiList.size());
		
		ArrayList LogicList=new ArrayList();
		LogicList.add("java");
		LogicList.add("python");
		LogicList.add("go lang");
		System.out.println("LogicList:"+LogicList);
		System.out.println("LogicList size:"+LogicList.size());
		
		ArrayList FullStackList=new ArrayList();
		FullStackList.add(UiList);
		System.out.println("FullStackList:"+FullStackList);
		System.out.println("FullStackList:"+FullStackList.size());
		FullStackList.addAll(LogicList);
		System.out.println("FullStackList:"+FullStackList);
		System.out.println("FullStackList:"+FullStackList.size());
	}

}
