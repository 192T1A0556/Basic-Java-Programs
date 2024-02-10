package recursionpractice;
import java.util.*;

public class RecursionTable {
      public static void main(String[] args) {
    	  Scanner scan=new Scanner(System.in);
    	  int n=scan.nextInt();
    	  printTable(n,1);
    	  	  
      }
      public static void printTable(int n,int times) {
    	  if(times==11) {
    		 return;
    	  }
    	  System.out.println(n+" * "+times+" = "+n*times);
    	  printTable(n,times+1);
      }
}
