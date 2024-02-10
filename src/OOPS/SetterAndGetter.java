package OOPS;
import java.util.*;
public class SetterAndGetter {
	public static void main(String[] args) {
		//object creation
		Employee emp=new Employee();
		//setting values
		emp.setId(101);
		emp.setName("kaju");
		emp.setDesg("antp");
		emp.setSalary(1500);
		//getting values
		System.out.println("emp:id="+emp.getId());
		System.out.println("emp:name="+emp.getName());
		System.out.println("emp:Desg="+emp.getDesg());
		System.out.println("emp:salary="+emp.getSalary());	
	}
}
class Employee{
	//instance variables/data members
	private int id;
	private String name;
	private String desg;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
