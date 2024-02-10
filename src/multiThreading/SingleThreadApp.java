package multiThreading;
import java.util.*;
public class SingleThreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumbers();
		PrintAlphabets();
	}
	public static void PrintNumbers() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Exception handled");
				
			}
		}
	}
	public static void PrintAlphabets() {
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
