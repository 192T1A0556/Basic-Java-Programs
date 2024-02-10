package generalinterviewprograms2;
import java.util.*;
public class BinaryToDecimal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a binary number:");
		int n=scan.nextInt();
		int temp=n;
		int sum=0;
		while(n>0) {
			int rev=n%10;
			n=n/10;
			sum++;
		}
		System.out.println(sum);
		int dec_value = 0; 
		  
        // Initializing base 
        // value to 1, i.e 2^0 
        int base = 1; 
  
        
        while (temp > 0) { 
            int last_digit = temp % 10; 
            temp = temp / 10; 
  
            dec_value += last_digit * base; 
  
            base = base * 2; 
        } 
        System.out.println(dec_value);
  
		
	}

}
