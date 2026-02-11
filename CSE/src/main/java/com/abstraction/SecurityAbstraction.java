package com.abstraction;



public class SecurityAbstraction {
	public static void main(String[] args) {
		duty(new Army());
		System.out.println("-----------------------\n");
		duty(new Navy());
		System.out.println("-----------------------\n");
		duty(new AirForce());
	

	}
	static void duty(SecurityForces s) {
	
		s.protect();
	}
}

abstract class SecurityForces{
	
	abstract void protect(); // The method which are incomplete that methods we make abstract. Here the body of method is not present thats why this method is incomplete.
	//since the method is incomplete the class itself became incomplete so we make class as abstract also.
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
