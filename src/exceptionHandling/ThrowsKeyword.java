package exceptionHandling;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class ThrowsKeyword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			takeInput();
		}
		catch(Exception e){
			System.out.println("Exception handled in main");
		}
	}
	public static void takeInput() throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("please provide integer input:");
		int num=Integer.parseInt(br.readLine());
		System.out.println("Integer input="+num);
		System.out.println("please provide string input:");
		String str=br.readLine();
		System.out.println("String input="+str);	
	}
}