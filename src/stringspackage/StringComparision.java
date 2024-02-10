package stringspackage;

public class StringComparision {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		String s2="java";
		String s3="JAVA";
		String s4="python";
		System.out.println("equals():");
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equals(s4));//false
		System.out.println("equalsIgnoreCase()");
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.equalsIgnoreCase(s3));//true
		System.out.println(s1.equalsIgnoreCase(s4));//false

	}

}
