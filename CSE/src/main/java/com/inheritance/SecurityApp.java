package com.inheritance;

public class SecurityApp {

	public static void main(String[] args) {
		Army a = new Army();
		a.job();
		a.protect();
		a.useTanks();
		Navy n = new Navy();
		n.job();
		n.protect();
		n.useShips();
		AirForce af = new AirForce();
		af.job();
		af.protect();
		af.useJets();

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
	void useTanks() {
		System.out.println("Makes use of tanks to Protect");
	}
}
class Navy extends SecurityForces{
	void protect() {
		System.out.println("Protected by Navy");
	}
	void useShips() {
		System.out.println("Makes use of Ships to protect");
	}
}
class AirForce extends SecurityForces{
	void protect() {
		System.out.println("Protected by Airforces");
	}
	void useJets() {
		System.out.println("Makes use of Jets to protect");
	}
}