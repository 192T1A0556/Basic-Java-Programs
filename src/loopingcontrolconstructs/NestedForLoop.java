package loopingcontrolconstructs;

public class NestedForLoop {
	public static void main(String[] args) {
		for(int i=1;i<=2;i++) {
			for(int j=1;j<=3;j++) {
				System.out.println("Inner Loop");
			}
			System.out.println("Outer Loop");
		}
	}

}
