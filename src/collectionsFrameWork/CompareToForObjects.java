package collectionsFrameWork;
import java.util.*;
public class CompareToForObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 st1=new Student3(3,"Mahesh",2005);
		Student3 st2=new Student3(1,"suresh",2007);
		Student3 st3=new Student3(2,"Deep",2010);
		ArrayList<Student3> stList=new ArrayList<Student3>();
		stList.add(st1);
		stList.add(st2);
		stList.add(st3);
		System.out.println("original list:"+stList);
		RollComparator rc=new RollComparator();
		YopComparator yc=new YopComparator();
		NameComparator nc=new NameComparator();
		Collections.sort(stList,rc);
		System.out.println("sorted list on roll basis:"+stList);
		Collections.sort(stList,yc);
		System.out.println("sorted list on yop basis:"+stList);
		Collections.sort(stList,nc);
		System.out.println("soretd list on name basis:"+stList);
		
		
		
	}

}
class Student3{
	int roll;
	String name;
	int yop;
	public Student3(int roll,String name,int yop){
		this.roll=roll;
		this.name=name;
		this.yop=yop;
	}
	public String toString() {
		return roll+" "+name+" "+yop;
	}
	
}
class RollComparator implements Comparator<Student3>{
	public int compare(Student3 o1,Student3 o2) {
		return o1.roll-o2.roll;
	}

	
}
class YopComparator implements Comparator<Student3>{
	public int compare(Student3 o1,Student3 o2) {
		return o1.yop-o2.yop;
	}
}
class NameComparator implements Comparator<Student3>{
	public int compare(Student3 o1,Student3 o2) {
		return o1.name.compareTo(o2.name);
	}
}

