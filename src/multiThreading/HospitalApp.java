package multiThreading;
import java.util.*;
public class HospitalApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital h=new Hospital();
		Batman bat=new Batman(h);
		Ironman iron=new Ironman(h);
		Thread t1=new Thread(bat);
		Thread t2=new Thread(iron);
		t1.setName("batman");
		t2.setName("ironman");
		t1.start();
		t2.start();
	}
}
class Hospital{
	public void batTreatment() {
		System.out.println("Batman is getting treatment");
	}
	public void ironTreatment() {
		System.out.println("Ironman is getting treatment");
	}
}
class Batman implements Runnable{
	Hospital h;
	Batman(Hospital h){
		this.h=h;
	}
	public void run() {
		h.batTreatment();
	}
}
class Ironman implements Runnable{
	Hospital h;
	Ironman(Hospital h){
		this.h=h;
	}
	public void run() {
		h.ironTreatment();
	}
}

