package OOPS;
import java.util.*;
public class ConstructorAndGetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation
		Keerthi emp=new Keerthi(101,"raj","antp",1500);
		//getting values
		System.out.println("emp:id="+emp.getId());
		System.out.println("emp:name="+emp.getName());
		System.out.println("emp:desg="+emp.getDesg());
		System.out.println("emp:salary="+emp.getSalary());
	}
}
class Keerthi{
	//instance variables
	private int id;
	private String name;
	private String desg;
	private int salary;
	//constructor for setters
	public Keerthi(int id,String name,String desg,int salary) {
		this.id=id;
		this.name=name;
		this.desg=desg;
		this.salary=salary;
	}
	//getters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDesg() {
		return desg;
	}
	public int getSalary() {
		return salary;
	}
}
