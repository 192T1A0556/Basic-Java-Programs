package OOPS;
import java.util.*;
public class ConstructorChaining {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c=new Child1();
	}
}
class Parent1 extends Object{
	Parent1(){
		System.out.println("By default it calls the object constructor by using super mathod");
		System.out.println("Parent Constructor");
	}
}
class Child1 extends Parent1{
	Child1(){
		System.out.println("By default it calls the parent constructor by using super method");
		System.out.println("Child Constructor");
	}
}