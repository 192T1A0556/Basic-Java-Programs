package stringspackage;

public class StringCompareTo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="virat";
		String s2="viru";
		int res=s1.compareTo(s2);
		System.out.println(res);//unicode value of a=97 and u=117 so the diff=-20 bcz the second string is greater
		if(res>0) {
			System.out.println("1st string is greater");
		}
		else if(res<0) {
			System.out.println("2nd string is greater");
		}
		else {
			System.out.println("both the Strings are equal");
		}

	}


}
