package patternspractice;

public class Pattern27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=6;i++) {
			
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
