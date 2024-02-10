package OOPS;
import java.util.*;
public class HybridInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullStackDeveloper fsd=new FullStackDeveloper();
		fsd.Code();
		fsd.Logic();
		fsd.FullApp();
		FrontEndDeveloper fes=new FrontEndDeveloper();
		fes.Code();
		fes.Ui();
	}
}
class SoftwareDeveloper{
	public void Code(){
		System.out.println("I am expert in coding");
	}
}
class FrontEndDeveloper extends SoftwareDeveloper{
	public void Ui() {
		System.out.println("as a UI developer");
	}
}
class BackendDeveloper extends SoftwareDeveloper{
	public void Logic() {
		System.out.println("as a logic developer");
	}
}
class FullStackDeveloper extends BackendDeveloper{
	public void FullApp() {
		System.out.println("as a full stack developer");
	}
}

