package interface1;

import java.util.Scanner;

public class KodCalciApp {

	public static void main(String[] args) {
//		KodCalci obj = new ASoftware();
//		duty(obj);
//		KodCalci obj2 = new BSoftware();
//		duty(obj2);
	
	
		

	}
	static void duty(KodCalci c) {
		c.add();
		c.sub();
		c.mul();
		c.div();
		((ASoftware)c).mod();// it is downCasting we use this to access the specialized method 
		
		
	}

}
class ASoftware implements KodCalci{

	@Override
	public void add() {
		int a = 10;
		int b = 20 ;
		int c = a + b;
		System.out.println(c);
		
	}

	@Override
	public void sub() {
		
		int a = 10;
		int b = 20 ;
		int c = a - b;
		System.out.println(c);
		
	}

	@Override
	public void mul() {
		int a = 10;
		int b = 20 ;
		int c = a * b;
		System.out.println(c);
		
		
	}

	@Override
	public void div() {
		int a = 10;
		int b = 20 ;
		int c =  b / a;
		System.out.println(c);
		
	}
	public void mod() {
		int a = 10;
		int b = 20;
		int c = b%a;
		System.out.println(c);
	}
	
}
class BSoftware implements KodCalci{
Scanner sc = new Scanner(System.in);

private float a;
private float b;
private float c;
	public BSoftware(float a, float b) {
	super();
	this.a = a;
	this.b = b;
}

	@Override
	public void add() {
		
		 c = a+b;
		System.out.printf("Addition of %.2f and %.2f : %.2f",a,b,c);
		
	}

	@Override
	public void sub() {
		
		 c = a-b;
		System.out.printf("Substraction of %.2f and %.2f : %.2f",a,b,c);
			
	}

	@Override
	public void mul() {
		 c = a*b;
		System.out.printf("Multiplication of %.2f and %.2f : %.2f",a,b,c);
			
		
	}

	@Override
	public void div() {
		 c = a/b;
		System.out.printf("Division of %.2f and %.2f : %.2f",a,b,c);
			
		
	}
	
}