package OOPS;
import java.util.*;
public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter roll number:");
		int roll=scan.nextInt();
		scan.nextLine();
		System.out.println("please enter name:");
		String name=scan.nextLine();
//		object creation1
		Student std1=new Student(roll,name);
		System.out.println("roll : "+roll);
		System.out.println("name : "+name);
		
//		object vreation2
		Student std2=new Student();
		//assigning values using setters and fetching using getters
		std2.setRoll(roll);
		System.out.println("Student roll:"+std2.getRoll());
		std2.setName(name);
		System.out.println("student name:"+std2.getName());

	}

}
class Student{
	private int roll;
	private String name;
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	public Student() {
		
    }
	//setter methods
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	//getter methods
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	
	
	
}
