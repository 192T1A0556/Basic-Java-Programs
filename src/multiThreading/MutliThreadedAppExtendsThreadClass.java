package multiThreading;
import java.util.*;
public class MutliThreadedAppExtendsThreadClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberThread nt=new NumberThread();
		AlphabetThread at=new AlphabetThread();
		nt.start();
		at.start();
	}
}
	class NumberThread extends Thread{
		public void run() {
			for(int i=1;i<=10;i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					System.out.println("Exception handled");
				}
			}
		}	
	}
	class AlphabetThread extends Thread{
		public void run() {
			for(char i='a';i<='j';i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					System.out.println("Exception handled");
				}
			}
		}	
	}

