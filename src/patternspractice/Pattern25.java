package patternspractice;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		for(int i=0;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(x);
				x++;
				if(j<i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
