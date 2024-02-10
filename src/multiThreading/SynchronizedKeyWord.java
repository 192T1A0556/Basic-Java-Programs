package multiThreading;
import java.util.*;
public class SynchronizedKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalTask task=new HospitalTask();
		Thread t1=new Thread(task);
		Thread t2=new Thread(task);
		t1.setName("bat man");
		t2.setName("iron man");
		t1.start();
		t2.start();
	}

}
class HospitalTask implements Runnable{
	synchronized public void run() {
		String tName=Thread.currentThread().getName();
		try {
			System.out.println(tName+" has entered clinic");
			Thread.sleep(2000);
			System.out.println(tName+" is getting treatmant");
			Thread.sleep(2000);
			System.out.println(tName+" getting out of clinic");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
