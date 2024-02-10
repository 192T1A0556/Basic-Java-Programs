package multiThreading;
import java.util.*;
public class MutliThreadAppImplementsRunnableInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloTask task=new HelloTask();
		HiTask task1=new HiTask();
		Thread th=new Thread(task);
		th.setName("helloThread");
		th.start();
		Thread th1=new Thread(task1);
		th1.setName("hiThread");
		th1.start();
	}
}
class HelloTask implements Runnable{
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println(t);
		try {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException e) {
			System.out.println("Exception handled");
		}
	}
}
class HiTask implements Runnable{
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println(t);
		try {
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException e) {
			System.out.println("Exception handled");
		}
	}
}
