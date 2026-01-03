package com.abstraction;

public class TrainerAbstaction {

	public static void main(String[] args) {
		duty(new JavaTrainer1());
		duty(new AptiTrainer1());
		duty(new TestTrainer1());
	}
	static void duty(Trainer1 t) {
		t.teach();	
		}

}
abstract class Trainer1{
abstract void teach() ;
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
