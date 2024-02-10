package OOPS;
import java.util.*;
public class Abstraction {
	public void driver(Vehicle v) {
		v.start();
		v.stop();
		v.refuel();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction ab=new Abstraction();
		ElectricalVehicle ev=new ElectricalVehicle();
		PetrolVehicle pv=new PetrolVehicle();
		DieselVehicle dv=new DieselVehicle();
		ab.driver(ev);
		ab.driver(pv);
		ab.driver(dv);
	}
}
abstract class Vehicle{
	public void start() {
		System.out.println("vehicle started");
	}
	public void stop() {
		System.out.println("vehicle stoped");
	}
	abstract public void refuel();
}
class ElectricalVehicle extends Vehicle{
	public void refuel() {
		System.out.println("charge vehicle");
	}
}
class PetrolVehicle extends Vehicle{
	public void refuel(){
		System.out.println("refuel with petrol");
	}
}
class DieselVehicle extends Vehicle{
	public void refuel() {
		System.out.println("refuel with diesel");
	}
}