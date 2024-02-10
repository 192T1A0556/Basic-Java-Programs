package kodnest;
import java.util.*;

//public class Java27day {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		int a=scan.nextInt();
//		if(a>=1) {
//			System.out.println("Number is positive");
//		}
//		System.out.println("end");
//	}
//
//}



//public class Java27day {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		char ch=scan.next().charAt(0);
//		if(ch>='A' && ch<='Z') {
//			System.out.println("Upper case letter");
//		}
//		System.out.println("end");
//			
//	}
//
//}



//public class Java27day {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		int a=scan.nextInt();
//		if(a%2==0) {
//			System.out.println("Divisible by 2");
//		}
//		System.out.println("end");
//			
//	}
//
//}


//public class Java27day {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		char ch=scan.next().charAt(0);
//		if(Character.isDigit(ch)) {
//			System.out.println("yes");
//		}
//		else {
//			System.out.println("no");
//		}
//			
//	}
//
//}


//public class Java27day {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		int a=scan.nextInt();
//		if(a%2==0) {
//			System.out.println("even number");
//		}
//		System.out.println("end");
//			
//	}
//
//}


//public class Java27day {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		int a =scan.nextInt();
//		if(a>=1) {
//			if(a%2==0 && a%3==0 && a%4==0) {
//				System.out.println("Divisible by 2,3 and 4");
//			}
//			System.out.println("end");
//		}
//	}
//
//}

//public class Java27day {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		int a=scan.nextInt();
//		if(a>=0) {
//			System.out.println("Positive number");
//		}
//		System.out.println("end");
//	}
//
//}

//public class Java27day {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//	    char a=scan.next().charAt(0);
//	    if(a=='M'|| a=='m') {
//	    	System.out.println("Male");
//	    }
//	    else if(a=='F' || a=='f'){
//	    	System.out.println("Female");
//	    	}
//	    else {
//	    	System.out.println("Please enter a valid character");
//	    }
//		
//	}
//
//}

//public class Java27day {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//	    int a=scan.nextInt();
//	    if(a%3==0) {
//	    	System.out.println("Divisible by 3");
//	    }
//	    else {
//	    	System.out.println("Not Divisible by 3");
//	    }
//	}
//
//}

//public class Java27day {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//	    int a=scan.nextInt();
//	    int b=scan.nextInt();
//	    if(a==b) {
//	    	System.out.println("The given shape is square");
//	    }
//	    else {
//	    	System.out.println("The given shape is not a square");
//	    }
//	    
//	}
//
//}

//public class Java27day {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//	    int a=scan.nextInt();
//	    if(a>700000) {
//	    	System.out.println("Income is greater than 7,00,000. Tax must be paid.");
//	    }
//	    else {
//	    	System.out.println("Income is 7,00,000 or less.No tax is required.");
//	    }
//	    
//	}
//
//}

//public class Java27day {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//	    char ch=scan.next().charAt(0);
//	    if(ch>='A' && ch<='Z') {
//	    	System.out.println("Upper case");
//	    }
//	    else {
//	    	System.out.println("Lower case");
//	    }
//	    
//	}
//
//}

//public class Java27day {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//	    int a=scan.nextInt();
//	    if(a>=30 && a<=300) {
//	    	System.out.println("true");
//	    }
//	    else {
//	    	System.out.println("false");
//	    }
//	}
//
//}

public class Java27day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    float m=scan.nextFloat();
	    double r;
	    String ch;
	    if(m>=90){
	    	r=m;
	    	ch="A";
	    }
	    else if(m>=80 && m<=89) {
	    	r=m;
	    	ch="B";
	    }
	    else if(m>=70 && m<=79) {
	    	r=m;
	    	ch="C";
	    }
	    else {
	    	r=m;
	    	ch="D";
	    }
	    System.out.println("For a percentage of "+r+"%,the grade is: "+ch);
	}

}

