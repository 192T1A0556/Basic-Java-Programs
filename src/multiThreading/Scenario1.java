package multiThreading;
import java.util.*;
public class Scenario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital1 h=new Hospital1();
		Batman1 bat=new Batman1(h);
		Ironman1 iron=new Ironman1(h);
		Thread t1=new Thread(bat);
		Thread t2=new Thread(iron);
		t1.setName("batman");
		t2.setName("ironman");
		t1.start();
		t2.start();

	}

}
class Hospital1{
	Object doc=new Object();
	Object bed=new Object();
	public void batTreatment() {
		synchronized(doc){
			System.out.println("Batman has accessed doctor");
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(bed) {
				System.out.println("Batman has accessed bed");
			}
		}
		
	}
	public void ironTreatment() {
		synchronized(doc) {
			System.out.println("Ironman has accessed doctor");
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(bed) {
				System.out.println("Ironman has accessed Bed");
			}
		}
	}
}
class Batman1 implements Runnable{
	Hospital1 h;
	Batman1(Hospital1 h){
		this.h=h;
	}
	public void run() {
		h.batTreatment();
	}
}
class Ironman1 implements Runnable{
	Hospital1 h;
	Ironman1(Hospital1 h){
		this.h=h;
	}
	public void run() {
		h.ironTreatment();
	}
}