package OOPS;
import java.util.*;
public class Aggregation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilot p=new Pilot("john");
		Airline air=new Airline("kodAir",p);
		air.operations();
		air=null;
		p.fly();
//		air.operations();//null pointer exception
	}
}
class Pilot{
	String name;
	 Pilot(String name){
		this.name=name;
	}
	void fly() {
		System.out.println(name+"is flying");
	}
}
class Airline{
	String airname;
	Pilot pilot;
	Airline(String airname,Pilot pilot){
		this.airname=airname;
		this.pilot=pilot;
	}
	void operations() {
		System.out.println(airname+"operations underway");
		pilot.fly();
	}
}
