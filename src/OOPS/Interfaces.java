package OOPS;
import java.util.*;
public class Interfaces {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artist art=new Artist();
		art.paint();
		art.sing();
	}
}
interface Singers{
	public void sing();
}
interface Painters{
	public void paint();
}
class Artist implements Singers,Painters{
	public void sing() {
		System.out.println("Learn to paint");
	}
	public void paint() {
		System.out.println("Learn to sing");
	}
}