package Main;

public class Inherite1 implements Interface1, Interface2{
	public String greeting;
	public int age;
	
	Inherite1 (String greeting, int age){
		this.greeting=greeting;
		this.age=age;
	}
	
	public String getName() {
		return this.greeting;
	}
	
	public int sayAge() {
		return this.age;
	}

	@Override
	public String sayBye() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int doSomething(int a, int b) {
		return a+b;
	}
}
