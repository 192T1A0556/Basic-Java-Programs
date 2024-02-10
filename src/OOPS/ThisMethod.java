package OOPS;
import java.util.*;
public class ThisMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child4 c=new Child4();
		
	}
}
class Parent4{
	Parent4(){
		System.out.println("parent constructor");
	}
}
class Child4{
	Child4(){
		this(10);
		System.out.println("default child constructor");
	}
	Child4(int x){
		this(10,20);
		System.out.println("1 parametried child constructor");
	}
	Child4(int x,int y){
		System.out.println("2 parametried child constructor");
	}
}