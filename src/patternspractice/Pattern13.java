package patternspractice;

public class Pattern13 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=10;j<=10*i;j+=10) {
				if(j==10*i) {
					System.out.println(j);
				}
				else {
					System.out.print(j+"*");
				}
			}
		}
	}

}
