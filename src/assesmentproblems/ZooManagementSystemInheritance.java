package assesmentproblems;
import java.util.*;
public class ZooManagementSystemInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Animal{
	String name;
	int age;
	Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
}
class Mammal extends Animal{
	String type;
	Mammal(String name,int age,String type){
		super(name,age);
		this.type=type;
	}
	
}
class Bird extends Animal{
	String type;
	Bird(String name,int age,String type){
		super(name,age);
		this.type=type;
	}
}
