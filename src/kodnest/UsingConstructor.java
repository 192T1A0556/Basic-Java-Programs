package kodnest;

//class StudentApp{
//	int roll;
//	String name;
//	int yop;
//	String city;
//	public void study() {
//		System.out.println("A student studies");
//	}
//	public StudentApp(int r,String n,int y,String c) {
//		roll=r;
//		name=n;
//		yop=y;
//		city=c;
//	}
//}
//public class UsingConstructor{
//	public static void main(String[] args) {
//		StudentApp s1=new StudentApp(1,"kavya",2023,"jaipur");
//		System.out.println(s1.roll+" "+s1.name+" "+s1.yop+" "+s1.city);
//		s1.study();
//	}
//}
//class Dog{
//	String breed;
//	int age;
//	public void bark() {
//		System.out.println("woof woof");
//	}
//	public Dog(){
//		breed="scooby";
//		System.out.println("Dog Constructor");
//	}
//}
//public class UsingConstructor{
//	public static void main(String[] args) {
//		Dog d1=new Dog();
//		System.out.println(d1.age);
//		d1.bark();
//		Dog d2;
//		Dog d3;
//		d3=new Dog();
//	}
//}

class Fresher{
	int uid;
	String name;
	String skills;
	public void giveInterview() {
		System.out.println("prepare and give interview");	
		}
	public Fresher(int uid,String name,String skills)
	{
      uid=uid;
      name=name;
      skills=skills;
	}
}
public class UsingConstructor{
	public static void main(String[] args) {
		Fresher f1=new Fresher(556,"keerthi","javacore");
		System.out.println(f1.uid);
		System.out.println(f1.name);
		System.out.println(f1.skills);
		f1.giveInterview();		
	}
}






