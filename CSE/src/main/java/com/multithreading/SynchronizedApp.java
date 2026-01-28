package com.multithreading;

public class SynchronizedApp {

	public static void main(String[] args) throws InterruptedException {
		WashRoom w = new WashRoom();
		
		Thread t2 = new Thread(w);
		Thread t1 = new Thread(w);
		Thread t3 = new Thread(w);

		t1.setName("Thor");
		t2.setName("Loki");
		t3.setName("Hulk");
		 
		
		// we can use join to maintain the flow but it has drawback because it is controlling at main class 
		t1.start();
//		t1.join();
		t2.start();
//		t2.join();
		t3.start();
//		t3.join();
	}

}
class WashRoom implements Runnable{

	// synchronized keyword control the thread it passes only one thread to utilize resources
	synchronized public void run() {
		try {
		String tname  = Thread.currentThread().getName();
		System.out.println(tname+" entring the Washroom.");
			Thread.sleep(3000);
		System.out.println(tname+" using the Washroom.");
			Thread.sleep(3000);
			
		System.out.println(tname+" leaving the Washroom.");
			
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}