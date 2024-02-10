package OOPS;
import java.util.*;
public class ConstructorOverridingChaining {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 ch=new Child2(3);
	}
}
class Parent2{
	Parent2(int x){
		System.out.println("This is parent Parameterized constructor");
	}
}
class Child2 extends Parent2{
	Child2(int x){
		super(x);
		System.out.println("This is child constructor");
	}
	
}