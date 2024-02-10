package OOPS;
import java.util.*;
public class Composition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book("Head first");
		b.readBook();
		b=null;
//		b.readBook();
	}
}
class Page{
	String content;
	Page(String content){
		this.content=content;
	}
	void display() {
		System.out.println("Display content on "+content);
	}
}
class Book{
	String bName;
	Page page;
	Book(String bName){
		this.bName=bName;
		this.page=new Page("oop");
	}
	void readBook() {
		System.out.println("Reading "+bName);
		page.display();
	}
}
