package multiThreading;
import java.util.*;
public class ThreadDemoOfUserThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=Thread.currentThread();
		System.out.println(t1);
		MyThread mt=new MyThread();
		mt.setName("MY-THREAD");
		mt.start();
	}
}
class MyThread extends Thread{
	public void run() {
		Thread t2=Thread.currentThread();
		System.out.println(t2);
	}
}
