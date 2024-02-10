package OOPS;
import java.util.*;
public class DownCastingInNormalMathod {
	public void usingRobo(Robo r) {
		r.walk();
		r.talk();
		r.learn();
		r.charge();
		if(r instanceof TeacherRobo) {
			((TeacherRobo) r).teach();
		}
		else if(r instanceof FighterRobo) {
			((FighterRobo) r).fight();
		}
		else if(r instanceof DriverRobo) {
			((DriverRobo) r).driver();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DownCastingInNormalMathod dw=new DownCastingInNormalMathod();
		TeacherRobo tr=new TeacherRobo();
		FighterRobo fr=new FighterRobo();
		DriverRobo dr=new DriverRobo();
		dw.usingRobo(tr);
		dw.usingRobo(fr);
		dw.usingRobo(dr);
	}
}
class Robo{
	public void walk() {
		System.out.println("walking");
	}
	public void talk() {
		System.out.println("talking");
	}
	public void learn() {
		System.out.println("learning");
	}
	public void charge() {
		System.out.println("charging");
	}
}
class TeacherRobo extends Robo{
	public void teach() {
		System.out.println("teach");
	}
}
class FighterRobo extends Robo{
	public void fight() {
		System.out.println("fight");
	}
}
class DriverRobo extends Robo{
	public void driver() {
		System.out.println("drive");
	}
}