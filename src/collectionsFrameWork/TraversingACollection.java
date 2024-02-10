package collectionsFrameWork;
import java.util.*;
public class TraversingACollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("using a simple for-loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("using a enhanced for-loop");
		for(Object el:al) {
			System.out.println(el);
		}
		System.out.println("using iterator");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
