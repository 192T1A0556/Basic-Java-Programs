package collectionsFrameWork;
import java.util.*;
public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud=new Student(1,"Deep");
		System.out.println("student ref:"+stud);
		String str=new String("Java");
		System.out.println("string ref:"+str);

	}

}
class Student{
	int roll;
	String name;
	Student(int roll,String name){
		this.roll=roll;
		this.name=name;
	}
	public String toString() {
		return roll+" "+name;
	}
}
