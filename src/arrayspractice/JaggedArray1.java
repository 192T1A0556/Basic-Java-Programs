package arrayspractice;

public class JaggedArray1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m=new int[3][];
		m[0]=new int[3];
		m[1]=new int[4];
		m[2]=new int[2];
		m[0][0]=55;
		m[0][1]=56;
		m[0][2]=57;
		m[1][0]=61;
		m[1][1]=62;
		m[1][2]=63;
		m[1][3]=64;
		m[2][0]=71;
		m[2][1]=72;
		System.out.println(m[0][0]);
		System.out.println(m[0][1]);
		System.out.println(m[0][2]);
		System.out.println(m[1][0]);
		System.out.println(m[1][1]);
		System.out.println(m[1][2]);
		System.out.println(m[1][3]);
		System.out.println(m[2][0]);
		System.out.println(m[2][1]);

	}


}
