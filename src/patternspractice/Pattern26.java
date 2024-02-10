package patternspractice;

public class Pattern26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=1;
		for(int i=0;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(x);
				if(x==1) {
					x=0;
				}
				else {
					x=1;
				}
			}
			System.out.println();
		}

	}


}
