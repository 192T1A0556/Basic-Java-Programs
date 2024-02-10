package kodnest;

//public class RandomProblem {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub	
//		//calling static method present in same class
//		fun1();
//		RandomProblem.fun1();
//		//calling non static method present in same class
//		RandomProblem obj=new RandomProblem();
//		obj.fun2();
//		//we can call static method using object but we should avoid it 
//		obj.fun1();	
//	}
//	//static method
//	public static void fun1() {
//		System.out.println("fun()1 executing");
//	}
//	//non static method
//	public void fun2() {
//		System.out.println("fun()2 executing");
//	}
//
//}

class Test1{
	//static method
	public static void fun1() {
		System.out.println("fun()1 executing");
	}
//	//non static method
    public void fun2() {
		System.out.println("fun()2 executing");
	}
	
}
//public class RandomProblem {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub	
//		//calling static method present in same class
//		fun1();
//		RandomProblem.fun1();
//		//calling non static method present in same class
//		RandomProblem obj=new RandomProblem();
//		obj.fun2();
//		//we can call static method using object but we should avoid it 
//		obj.fun1();	
//	}
//	//static method
//	public static void fun1() {
//		System.out.println("fun()1 executing");
//	}
//	//non static method
//	public void fun2() {
//		System.out.println("fun()2 executing");
//	}
//
//}

public class RandomProblem{
	public static void main(String[] args) {
		Test1.fun1();
		Test1 obj=new Test1();
		obj.fun2();		
	}
}
