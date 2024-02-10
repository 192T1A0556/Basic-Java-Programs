package OOPS;
import java.util.*;
public class ClassComponents {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Total no of circles:"+Circlename.getTotalCircles());
		System.out.println("================================================");
		System.out.println("Enter radius of circle1:");
		int r1=scan.nextInt();
		Circlename c1=new Circlename(r1);
		c1.calArea();
		System.out.println("Enter radius of circle2:");
		int r2=scan.nextInt();
		Circlename c2=new Circlename(r2);
		c2.calArea();
		System.out.println("enter radius of circle3:");
		int r3=scan.nextInt();
		Circlename c3=new Circlename(r3);
		c3.calArea();
		System.out.println("================================================");
		System.out.println("Total no of circles:"+Circlename.getTotalCircles());
	}
}
class Circlename{
	//static variable
	static double pi=3.14;
	static int numCircle=0;
	//static block
	static {
		System.out.println("Number of circles:");
		System.out.println("====================");
	}
	//instance block or non static block
	{
		numCircle+=1;
		System.out.println("The area of circle:"+numCircle);
	}
	//constructor
	public Circlename(int radius) {
		this.radius=radius;
	}
	//non static variable
	int radius;
	//non static method calArea()
	public void calArea() {
		double res=pi*(radius*radius);
		System.out.println("The area of circle:"+res);
	}
	//static method getTotalCircles()
	public static int getTotalCircles() {
		return numCircle;
	}
}
