package com.polymorphism;



public class SecurityPolymorphismApp {

	public static void main(String[] args) {
		duty(new Army());
		System.out.println("-----------------------\n");
		duty(new Navy());
		System.out.println("-----------------------\n");
		duty(new AirForce());
	

	}
	static void duty(SecurityForces s) {
		s.job();
		s.protect();
	}
}

class SecurityForces{
	void job () {
		System.out.println("The job is to Secure the Nation");
	}
	void protect() {
		System.out.println("Protected by Security Forces");
	}
}
class Army extends SecurityForces{
	void protect() {
		System.out.println("Protected by Army .");
	}
	
}
class Navy extends SecurityForces{
	void protect() {
		System.out.println("Protected by Navy");
	}
	
}
class AirForce extends SecurityForces{
	void protect() {
		System.out.println("Protected by Airforces");
	}
}