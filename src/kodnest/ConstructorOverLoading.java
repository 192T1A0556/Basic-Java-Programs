package kodnest;
import java.util.Scanner;
class Employee
{
	int id;
	String name;
	int salary;
	public void giveInfo()
	{
		System.out.println("EMP ID:"+id);
		System.out.println("EMP NAME:"+name);
		System.out.println("EMP SALARY:"+salary);
	}
	public Employee(int id,String name,int salary) {
		System.out.println("3 parameter constructor");
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public Employee() {
		System.out.println("0 parameter constructor");
	}
	public Employee(int id) {
		System.out.println("1 parameter constructor");
		this.id=id;
	}
}

public class ConstructorOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter id for 1st user:");
		int id1=scan.nextInt();
		System.out.println("please enter name for 1st user:");
		String name1=scan.nextLine();
		scan.nextLine();
		System.out.println("please enter salary for 1st user:");
		int salary=scan.nextInt();
		Employee emp1=new Employee(id1,name1,salary);
		emp1.giveInfo();
		Employee emp2=new Employee();
		emp2.giveInfo();
		System.out.println("please enter id for 3rd user:");
		int id3=scan.nextInt();
		Employee emp3=new Employee(id3);
		emp3.giveInfo();
	}

}

//class Employee
//{
//	int id;
//	String name;
//	int salary;
//	public void giveInfo()
//	{
//		System.out.println("EMP ID:"+id);
//		System.out.println("EMP NAME:"+name);
//		System.out.println("EMP SALARY:"+salary);
//	}
//	public Employee(int id,String name,int salary) {
//		System.out.println("3 parameter constructor");
//		this.id=id;
//		this.name=name;
//		this.salary=salary;
//	}
//	public Employee() {
//		System.out.println("0 parameter constructor");
//	}
//	public Employee(int id) {
//		System.out.println("1 parameter constructor");
//		this.id=id;
//	}
//}
//public class UsingMultipleConstructore{
//	public static void main(String[] args) {
//		Employee emp1=new Employee(1,"deep",50000);
//		Employee emp3=new Employee(55);
//		Employee emp2=new Employee();
//		emp1.giveInfo();
//		emp2.giveInfo();
//		emp3.giveInfo();		
//	}
//}
