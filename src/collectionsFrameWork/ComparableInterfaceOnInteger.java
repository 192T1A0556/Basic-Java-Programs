package collectionsFrameWork;
import java.util.*;
public class ComparableInterfaceOnInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 st1=new Student1(3,"Mahesh",2005);
		Student1 st2=new Student1(1,"suresh",2007);
		Student1 st3=new Student1(2,"Deep",2010);
		ArrayList<Student1> stList=new ArrayList<Student1>();
		stList.add(st1);
		stList.add(st2);
		stList.add(st3);
		System.out.println("original list:"+stList);
		Collections.sort(stList);
		System.out.println("sorted list:"+stList);
		

	}

}
class Student1 implements Comparable<Student1>{
	int roll;
	String name;
	int yop;
	Student1(int roll,String name,int yop){
		this.roll=roll;
		this.name=name;
		this.yop=yop;
	}
	public String toString() {
		return roll+" "+name+" "+yop;
	}
	public int compareTo(Student1 o) {
		if(this.yop>o.yop) {
			return 1;
		}
		else if(this.yop<o.yop) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

