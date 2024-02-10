package assesmentproblems;
import java.util.*;
class Product{
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void display(String name,double price) {
		System.out.println("product name:"+name);
		System.out.println("product price:$"+price);
	}
	
}
class Electronics extends Product{
	
	
}
class Clothing extends Product{

	
}
public class OnlineMarketPlaceInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please choose 1 for Electronics and 2 for Clothing:");
		int n=scan.nextInt();
		scan.nextLine();
		if(n==1) {
			System.out.println("please enter name of product:");
			String name=scan.nextLine();
			System.out.println("please entere price for price:");
			double price=scan.nextInt();
			
			Electronics ec=new Electronics();
			System.out.println("product information:");
			ec.display(name, price);	
		}
		else if(n==2) {
			System.out.println("please enter name of product:");
			String name=scan.nextLine();
			System.out.println("please entere price for price:");
			double price=scan.nextInt();
			
			Electronics ec=new Electronics();
			System.out.println("product information:");
			ec.display(name, price);	
			
		}

	}

}
