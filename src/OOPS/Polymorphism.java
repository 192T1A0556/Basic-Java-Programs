package OOPS;
import java.util.*;
public class Polymorphism {
	public void makePayment(PaymentApp pa) {
		pa.pay();
		pa.notifyUser();
		pa.promo();
		pa.displayBalance();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism p=new Polymorphism();
		Wallet w=new Wallet();
		UPI u=new UPI();
		Card c=new Card();
		p.makePayment(w);
		p.makePayment(u);
		p.makePayment(c);
	}
}
class PaymentApp{
	public void pay() {
		System.out.println("Make payment");
	}
	public void notifyUser() {
		System.out.println("notify the user");
	}
	public void promo() {
		System.out.println("give disscount on promo");
	}
	public void displayBalance() {
		System.out.println("Display Balance");
	}
}
class Wallet extends PaymentApp{
	public void pay() {
		System.out.println("By using wallet");
	}
}
class UPI extends PaymentApp{
	public void pay() {
		System.out.println("By using UPI");
	}
}
class Card extends PaymentApp{
	public void pay() {
		System.out.println("By using Card");
	}
}
