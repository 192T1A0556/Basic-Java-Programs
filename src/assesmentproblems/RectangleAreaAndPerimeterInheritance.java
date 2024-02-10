package assesmentproblems;
import java.util.*;
class Length{
	int length;
}
class Width extends Length{
	int width;
	Width(int length,int width){
		this.length=length;
		this.width=width;
	}
	int calculateArea() {
		return length*width;
	}
	int calculatePerimeter() {
		return 2*(length+width);
	}
	
}
public class RectangleAreaAndPerimeterInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter first number:");
		int a=scan.nextInt();
		System.out.println("please enter second number:");
		int b=scan.nextInt();
		Width res=new Width(a,b);
		int area=res.calculateArea();
		System.out.println("Area is:"+area);
		int perimeter=res.calculatePerimeter();
		System.out.println("Perimeter is:"+perimeter);
		

	}

}
