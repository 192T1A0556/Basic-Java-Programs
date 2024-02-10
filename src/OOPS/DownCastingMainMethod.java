package OOPS;
import java.util.*;
public class DownCastingMainMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tendulkar at=new ArjunTendulkar();
		at.Play();
		at.Role();
		// at.Smoke(); causes error in upcasting
		System.out.println("child specific methods accessing by down casting in directly in main method");
		((ArjunTendulkar)(at)).Smoke();//down casting

	}
}
class Tendulkar{
	public void Play() {
		System.out.println("play cricket");
	}
	public void Role() {
		System.out.println("Batsman");
	}
}
class ArjunTendulkar extends Tendulkar{
	//play method inherited
	//role mathod overrided
	public void Role() {
		System.out.println("Bowler");
	}
	//child specific method
	public void Smoke() {
		System.out.println("smoke");
	}
	
}
