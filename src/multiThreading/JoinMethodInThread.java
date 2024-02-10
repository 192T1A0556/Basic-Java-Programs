package multiThreading;
import java.util.*;
public class JoinMethodInThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		t.setName("os thread");
		System.out.println(t.getName()+" is starting execution");
		ChromeThread ct=new ChromeThread();
		EclipseThread et=new EclipseThread();
		ct.setName("chrome thread");
		et.setName("eclipse thread");
		ct.start();
		et.start();
		try {
			ct.join();
			et.join();
		}
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
		System.out.println(t.getName()+" is finishing execution");
	}
}
class ChromeThread extends Thread{
	public void run() {
		String tName=Thread.currentThread().getName();
		for(int i=1;i<=5;i++) {
			System.out.println(tName+" is running");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(tName+" is finishing execution");
	}
}
class EclipseThread extends Thread{
	public void run() {
		String tName=Thread.currentThread().getName();
		for(int i=1;i<=5;i++) {
			System.out.println(tName+" is running");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(tName+" is finishing execution");
	}
	
}
