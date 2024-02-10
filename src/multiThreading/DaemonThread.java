package multiThreading;
import java.util.*;
public class DaemonThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ErrorCheckThread error=new ErrorCheckThread();
		TypeCodeThread typing=new TypeCodeThread();
		SavingThread saving=new SavingThread();
		//step-1
		saving.setDaemon(true);
		error.start();
		typing.start();
		saving.start();
	}
}
class ErrorCheckThread extends Thread{
	public void run() {
		for(int i=1;i<=7;i++) {
			System.out.println("checking for error");
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class TypeCodeThread extends Thread{
	public void run() {
		for(int i=1;i<=7;i++) {
			System.out.println("typing code");
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class SavingThread extends Thread{
	public void run() {
		//step-2-Infinite loop
		for(;;) {
			System.out.println("saving code");
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
