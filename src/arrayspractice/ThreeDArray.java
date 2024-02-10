package arrayspractice;

public class ThreeDArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//blocks
		//rows
		//columns
		String[][][] names=new String[2][2][3];
		names[0][0][0]="aaa";
		names[0][0][1]="bbb";
		names[0][0][2]="ccc";
		
		names[0][1][0]="ddd";
		names[0][1][1]="eee";
		names[0][1][2]="fff";
		
		names[1][0][0]="ggg";
		names[1][0][1]="hhh";
		names[1][0][2]="iii";
		
		names[1][1][0]="jjj";
		names[1][1][1]="kkk";
		names[1][1][1]="lll";
		
		System.out.println(names[0][0][0]);
		System.out.println(names[0][0][1]);
		System.out.println(names[0][0][2]);
		
		System.out.println(names[0][1][0]);
		System.out.println(names[0][1][1]);
		System.out.println(names[0][1][2]);
		
		System.out.println(names[1][0][0]);
		System.out.println(names[1][0][1]);
		System.out.println(names[1][0][2]);
		
		System.out.println(names[1][1][0]);
		System.out.println(names[1][1][1]);
		System.out.println(names[1][1][1]);
		

	}


}
