package multiThreading;
import java.util.*;
public class PizzaBakeAndConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaHouse1 ph=new PizzaHouse1();
		Baker1 b=new Baker1(ph);
		Customer1 c=new Customer1(ph);
		Thread t1=new Thread(b);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
		

	}

}
class PizzaHouse1{
	boolean baked=false;
	int token;
	public synchronized void bake(int token) throws InterruptedException{
		if(baked==true) {
			wait();
		}
		else {
			this.token=token;
			System.out.println("pizza baked for order"+this.token);
			baked=true;
			notify();
		}
	}
	public synchronized void eat() throws InterruptedException{
		if(baked==false) {
			wait();
		}
		else {
			System.out.println("pizza collected for order"+this.token);
			if(baked==false)
				notify();
		}
	}
}
class Baker1 implements Runnable{
	PizzaHouse1 ph;
	Baker1(PizzaHouse1 ph){
		this.ph=ph;
	}
	public void run(){
		int token=0;
		while(true){
			try {
				ph.bake(token++);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Customer1 implements Runnable{
	PizzaHouse1 ph;
	Customer1(PizzaHouse1 ph){
		this.ph=ph;
	}
	public void run() {
		while(true) {
			try {
				ph.eat();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
