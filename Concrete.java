package week3day2;

public class Concrete extends AutomationTool  implements Language {

	public void java() {
System.out.println("i learn Java");		
	}

	public void Selenium() {
System.out.println("i learn Selenium");		
	}

	@Override
	public void selenium() {
System.out.println("I Learn Selenium Interface");
	}

	
	
	public static void main(String[] args) {
		Concrete cr = new Concrete();
		cr.java();
		cr.selenium();
		cr.Selenium();
		
		
	}
}

