package com.polymorphism;

public class ReducedTrainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Trainer t;
//		t= new JavaTrainer();
//		t.teach();
//		t = new AptiTrainer();
//		t.teach();
//		t = new TestTrainer();
//		t.teach();
		
		
		
//		Here we are reducing the code to achieve complete Polymorphism
		
		duty(new JavaTrainer1());
		duty(new AptiTrainer1());
		duty(new TestTrainer1());
	}
	static void duty(Trainer1 t) {
		t.teach();	
		}

}
class Trainer1{
	void teach() {
		System.out.println("Trainer called");
	}
	
}
class JavaTrainer1 extends Trainer1{
	void teach() {
		System.out.println("Java Trainer called");
	}
}
class AptiTrainer1 extends Trainer1{
	void teach() {
		System.out.println("Apti Trainer Called");
	}
}
class TestTrainer1 extends Trainer1{
	void teach() {
		System.out.println("Testing Trainer Called");
	}
}
