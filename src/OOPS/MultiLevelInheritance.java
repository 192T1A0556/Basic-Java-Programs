package OOPS;
import java.util.*;
public class MultiLevelInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone10 a=new Iphone10();
		a.applePay();
		a.waterResistant();
		a.dualCamera();
		a.siri();
	}
}
class Iphone6{
	public void applePay() {
		System.out.println("This is applepay mobile");
	}
}
class Iphone8 extends Iphone6{
	public void waterResistant() {
		System.out.println("This helps to find water Resistance");
	}
	public void dualCamera() {
		System.out.println("This is dual camera");
	}
}
class Iphone10 extends Iphone8{
	public void siri() {
		System.out.println("This is siri");
	}
}