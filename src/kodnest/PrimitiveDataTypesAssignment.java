package kodnest;
import java.util.Scanner;

class PrimitiveDataTypesAssignment{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name:");
		String name = scan.nextLine();
		System.out.println("enter your age:");
		byte age= scan .nextByte();
		System.out.println("enter your year:");
		short year=scan.nextShort();
		System.out.println("enter your salary:");
		int salary=scan.nextInt();
		System.out.println("enter your ctc:");
		long ctc=scan.nextLong();
		System.out.println("enter your cgpa:");
		float cgpa=scan.nextFloat();
		System.out.println("enter pivalue:");
		double pivalue=scan.nextDouble();
		System.out.println("enter your gender:");
		char gender=scan.next().charAt(0);
		System.out.println("enter ismarried:");
		boolean ismarried=scan.nextBoolean();
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("year:"+year);
		System.out.println("salary:"+salary);
		System.out.println("ctc:"+ctc);
		System.out.println("cgpa:"+cgpa);
		System.out.println("pivalue:"+pivalue);
		System.out.println("gender:"+gender);
		System.out.println("ismarried:"+ismarried);
	}
}

