package conditionalcontrolconstructs;
import java.util.*;
public class ElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter marks");
		int marks=sc.nextInt();
		if(marks>90) {
			System.out.println("Gift is Bike");
		}
		else if(marks>80 && marks<=90) {
			System.out.println("Gift is Laptop");
		}
		else if(marks>70 && marks<=80) {
			System.out.println("Gift is smartphone");
		}
		else if(marks>40 && marks<=70) {
			System.out.println("Gift is bicycle");
		}

	}

}
