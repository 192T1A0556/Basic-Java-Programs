package generalinterviewprograms2;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class FindDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		String str1=Integer.toString(a);
		String str2=Integer.toString(b);
		String str3=Integer.toString(c);
		
		if(str1.length()==1) {
			str1="0"+str1;
		}
		if(str2.length()==1) {
			str2="0"+str2;
		}
	    
		String inputDate=str1.concat("-").concat(str2).concat("-").concat(str3);
		DateTimeFormatter dateFormatter=DateTimeFormatter.ofPattern("M-d-yyyy");
		LocalDate date=LocalDate.parse(inputDate,dateFormatter);
		DayOfWeek dayOfWeek=date.getDayOfWeek();
		String dayOfWeekName=dayOfWeek.toString();
		System.out.println(dayOfWeekName);

	}

}
