package multiThreading;
import java.util.*;
public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital2 h=new Hospital2();
		Batman2 bat=new Batman2(h);
		Ironman2 iron=new Ironman2(h);
		Thread t1=new Thread(bat);
		Thread t2=new Thread(iron);
		t1.setName("batman");
		t2.setName("ironman");
		t1.start();
		t2.start();
	}

}
class Hospital2{
	Object doc=new Object();
	Object bed=new Object();
	public void batTreatmant() {
		synchronized(doc) {
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
		synchronized(bed) {
			System.out.println("Ironman has accessed bed");
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(doc) {
				System.out.println("Ironman has accessed doctor");
			}
		}
	}
}
class Batman2 implements Runnable{
	Hospital2 h;
	Batman2(Hospital2 h){
		this.h=h;
	}
	public void run() {
		h.batTreatmant();
	}
}
class Ironman2 implements Runnable{
	Hospital2 h;
	Ironman2(Hospital2 h){
		this.h=h;
	}
	public void run() {
		h.ironTreatment();
	}
}