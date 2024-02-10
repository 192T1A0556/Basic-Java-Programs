package OOPS;
import java.util.*;
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		System.out.println("Hobby: "+c.hobby);
		c.cook();
	}

}
class Parent{
	String hobby="Singing";
	public void cook() {
		System.out.println("I Like Cooking");
	}
}
class Child extends Parent{
	
}
