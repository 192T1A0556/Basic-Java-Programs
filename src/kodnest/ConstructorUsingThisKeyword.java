package kodnest;
class Freesher{
	int uid;
	String name;
	String skills;
	public void giveInterview() {
		System.out.println("prepare and give interview");
	}
	public Freesher(int uid,String name,String skills) 
	{
		this.uid=uid;
		this.name=name;
		this.skills=skills;	
	}
}
public class ConstructorUsingThisKeyword {
	public static void main(String[] args) 
	{
		Freesher f=new Freesher(1,"deep","java");
		System.out.println(f.uid+" "+f.name+" "+f.skills);
		f.giveInterview();
	}

}
