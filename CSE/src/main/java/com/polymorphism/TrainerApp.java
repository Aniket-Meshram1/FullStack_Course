package com.polymorphism;

public class TrainerApp {

	public static void main(String[] args) {
	// we make use of parent reference to achieve the d
		Trainer t;
		t= new JavaTrainer();
		t.teach();
		t = new AptiTrainer();
		t.teach();
		t = new TestTrainer();
		t.teach();
	}

}
class Trainer{
	void teach() {
		System.out.println("Trainer called");
	}
	
}
class JavaTrainer extends Trainer{
	void teach() {
		System.out.println("Java Trainer called");
	}
}
class AptiTrainer extends Trainer{
	void teach() {
		System.out.println("Apti Trainer Called");
	}
}
class TestTrainer extends Trainer{
	void teach() {
		System.out.println("Testing Trainer Called");
	}
}