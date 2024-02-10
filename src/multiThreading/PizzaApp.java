package multiThreading;
import java.util.*;
public class PizzaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaHouse ph=new PizzaHouse();
		Baker b=new Baker(ph);
		Customer c=new Customer(ph);
		Thread t1=new Thread(b);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();

	}

}
class PizzaHouse{
	int token;
	public void bake(int token) {
		this.token=token;
		System.out.println("Pizza baked for order:"+this.token);
	}
	public void eat() {
		System.out.println("pizza collected for order:"+this.token);
	}
}
class Baker implements Runnable{
	PizzaHouse ph;
	Baker(PizzaHouse ph){
		this.ph=ph;
	}
	public void run() {
		int token=0;
		ph.bake(token++);
	}
}
class Customer implements Runnable{
	PizzaHouse ph;
	Customer(PizzaHouse ph){
		this.ph=ph;
	}
	public void run() {
		while(true) {
			ph.eat();
		}
	}
}
