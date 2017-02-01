package Main;

public class Main {

	public static void main(String[] args) {
		
		Inherite1 newone = new Inherite1("Lulz", 5);
		Inherite2 newone2 = new Inherite2();
		
		System.out.println(newone.getName());
		System.out.println("My age: " + newone.sayAge());
		
		newone.toString();
		
		double p = Interface1.PI;
		System.out.println(p*2);
		
		System.out.println(newone.doSomething(4,5));
		System.out.println(newone2.doSomething(4,5));
	}

}
