package collectionsFrameWork;
import java.util.Iterator;
import java.util.concurrent.*;
public class ConurrentModification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList list=new CopyOnWriteArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			list.add(99);
		}
		System.out.println(list);
	}

}
