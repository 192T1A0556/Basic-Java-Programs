package OOPS;
import java.util.*;
public class OverRidingStaticMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent5 p1=new Parent5();
		p1.fun();
		Child5 c=new Child5();
		c.fun();
		Parent5 p2=new Child5();
		p2.fun();
	}

}
class Parent5{
	static void fun() {
		System.out.println("parent fun");
	} 
}
class Child5 extends Parent5{
	static void fun() {
		System.out.println("child fun");
	}
}
