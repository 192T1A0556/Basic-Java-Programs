package kodnest;
import java.util.Scanner;
class Teacher{
	int id;
	String name;
	int salary;
	public void teach() {
		System.out.println("teacher is going to take the class");
	}
}

public class TeacherApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Teacher tech1=new Teacher();
		System.out.println("enter teacher id:");
		tech1.id=scan.nextInt();
		scan.nextLine();
		System.out.println("enter name of teacher1:");
		tech1.name=scan.nextLine();
		System.out.println("enter the salary:");
		tech1.salary=scan.nextInt();
		System.out.print(tech1.name+" ");
		tech1.teach();
		
		Teacher tech2=new Teacher();
		System.out.println("enter teacher id:");
		tech2.id=scan.nextInt();
		scan.nextLine();
		System.out.println("enter name of teacher2:");
		tech2.name=scan.nextLine();
		System.out.println("enter the salary:");
		tech2.salary=scan.nextInt();
		System.out.print(tech2.name+" ");
		tech2.teach();
		
	}
}


