package collectionsFrameWork;
import java.util.*;
public class ComparableInterfaceOnStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 st1=new Student2(3,"Mahesh",2005);
		Student2 st2=new Student2(1,"suresh",2007);
		Student2 st3=new Student2(2,"Deep",2010);
		ArrayList<Student2> stList1=new ArrayList<Student2>();
		stList1.add(st1);
		stList1.add(st2);
		stList1.add(st3);
		System.out.println("original list:"+stList1);
		Collections.sort(stList1);
		System.out.println("soreted list:"+stList1);
		

	}

}
class Student2 implements Comparable<Student2>{
	int roll;
	String name;
	int yop;
	Student2(int roll,String name,int yop){
		this.roll=roll;
		this.name=name;
		this.yop=yop;
	}
	public String toString() {
		return roll+" "+name+" "+yop;
	}
	public int compareTo(Student2 o) {
		String s1=this.name;
		String s2=o.name;
		return s1.compareTo(s2);
	}
}