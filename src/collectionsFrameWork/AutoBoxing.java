package collectionsFrameWork;
import java.util.*;
public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(995000);//al.add(new Integer(995000));
		al.add(5.77);//al.add(new Double(5.77));
		al.add(false);//al.add(new Boolean(false));
		al.add('A');//al.add(new Character('A'));
		System.out.println(al);//[99500,5.77,false,'A']
	}

}
