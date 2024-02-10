package hashing;
import java.util.*;
public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map=new HashMap();
		map.put(20, "rahul");
		map.put(10, "rohit");
		map.put(15, "raj");
		map.put(30, "ramu");
		System.out.println("keys");
		Set keys=map.keySet();
		for(Object o:keys) 
			System.out.println(o);
		
		System.out.println("values");
		Collection val=map.values();
		for(Object o:val)
			System.out.println(o);
		System.out.println("key-value pairs");
		Set kv=map.entrySet();
		for(Object o:kv)
			System.out.println(o);

	}

}
