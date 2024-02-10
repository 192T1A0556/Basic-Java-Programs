package stringspackage;

public class ImmutableDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("java");
		s.concat("script");
		System.out.println(s);//java
		String s2=s.concat("programming");
		System.out.println(s);//java
		System.out.println(s2);//java programming
	}

}
