package generalinterviewprograms;
import java.util.*;
//A number is called an automorphic number if and only if the square of the given
//number ends with the same number itself 6**2=36 and 25**2=625
public class AutoMorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=scan.nextInt();
        boolean res=AutoMorphic.detectAutoMorphic(n);
        if(res==true) {
        	System.out.println("entred nuumber "+n+" is AutoMorphic");
        }
        else {
        	System.out.println("entred number "+n+" is not AutoMorphic");
        }
	}
	class AutoMorphic{
		static boolean detectAutoMorphic(int num) {
			int square=num*num;
			while(num!=0) {
				if(num%10!=square%10) {
					return false;
				}
				num=num/10;
				square=square/10;
			}
			return true;
		}
	}
	

}
