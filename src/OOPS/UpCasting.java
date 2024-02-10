package OOPS;
import java.util.*;
public class UpCasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("parent class holding child class objects known as upcasting");
		Shape c1=new Circle();
		c1.draw();
		Shape r1=new Rectangle();
		r1.draw();
	}
}
class Shape{
	public void draw() {
		System.out.println("draw mathod");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("drawing circle");
	}
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("drawing rectangle");
	}
}