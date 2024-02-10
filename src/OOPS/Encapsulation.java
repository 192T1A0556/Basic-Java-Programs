package OOPS;
import java.util.*;
public class Encapsulation {
	public static void main(String[] args) {
//		hero
		Bank b=new Bank();
		int key=4321;
		b.setHeroMoney(key, 20000);
		int b1=b.getHeroMoney(key);
		System.out.println(b1);
		System.out.println("================");
//		villian
		Bank b2=new Bank();
		int key1=420;
		b2.setHeroMoney(key1, 20000);
		int b3=b2.getHeroMoney(key1);
		System.out.println(b3);                                                                                                       	
	}
}
class Bank{
	private int heroMoney=10000;
	private int heroKey=4321;
	public void setHeroMoney(int key,int newBalance) {
		if(key==heroKey) {
			heroMoney=newBalance;
		}
		else {
			System.out.println("Invalid key");
			return;
		}
	}
	public int getHeroMoney(int key) {
		if(key==heroKey) {
			return heroMoney;
		}
		else {
			System.out.println("Invalid key");
			return -1;
		}
	}
}
