package kodnest;
class student{
	int roll;
	String name;
	int yop;
	String city;
	public void study() {
		System.out.println("A student studies");
		}
}

public class MultipleObjects {
	public static void main(String[] args) {
		student s1=new student();
		s1.roll=1;
		s1.name="kavya";
		s1.yop=2023;
		s1.city="kurnool";
		s1.study();
		System.out.println(s1.roll+" "+s1.name+" "+s1.yop+" "+s1.city);
		
		student s2=new student();
		s2.roll=2;
		s2.name="keerthi";
		s2.yop=2022;
		s2.city="rajasthan";
		s2.study();
		System.out.println(s2.roll+" "+s2.name+" "+s2.yop+" "+s2.city);
	}

}
