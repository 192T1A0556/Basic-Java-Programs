package collectionsFrameWork;
import java.util.*;
public class UnBoxing 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		System.out.println("printing values while in autoboxing");
		al.add(99500);
		al.add(5.77);
		al.add(false);
		System.out.println(al);
		System.out.println("printing values while in unboxing");
		int a=(int) al.get(0);
		double b=(double) al.get(1);
		boolean c=(boolean) al.get(2);
		System.out.println(al);
	}
}
