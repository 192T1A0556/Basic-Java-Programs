package OOPS;
import java.util.*;
public class SuperKeyword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child3 c3=new Child3();
		c3.accessParent();
		c3.accessChild();
	}
}
class Parent3{
	int x=100;
	public void fun() {
		System.out.println("Parent fun method");
	}
}
class Child3 extends Parent3{
	int x=200;
	public void fun() {
		System.out.println("child fun method");
	}
	public void accessChild(){
		System.out.println("child x="+x);
		fun();
	}
	public void accessParent() {
		System.out.println("parent x="+super.x);
		super.fun();
	}
	
}
