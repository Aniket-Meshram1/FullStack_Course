package interface1;

public class MultipleInheritanceApp {

	public static void main(String[] args) {
		Multiple m = new Multiple();
		m.add();
		m.sub();
		m.mul();
		m.div();
		m.mod();

	}
	

}
interface KodCalci1{
	 
	void add();
	void sub();
}
interface KodCalci2{
	void mul();
	void div();
	void mod();
}
class Multiple implements KodCalci1,KodCalci2{

	@Override
	public void mul() {
		int a = 10;
		int b = 20;
		int c = a*b;
		System.out.println(c);
		
	}

	@Override
	public void div() {
		int a = 10;
		int b = 20;
		int c = b/a;
		System.out.println(c);
		
	}

	@Override
	public void mod() {
		int a = 10;
		int b = 20;
		int c = b%a;
		System.out.println(c);
		
	}

	@Override
	public void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		
	}

	@Override
	public void sub() {
		int a = 10;
		int b = 20;
		int c = a-b;
		System.out.println(c);
		
	}
	
}