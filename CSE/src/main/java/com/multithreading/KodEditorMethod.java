package com.multithreading;

public class KodEditorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kode t1 = new Kode();
		Kode t2 = new Kode();
		Kode t3 = new Kode();
		t1.setName("Type");
		t2.setName("SpellCheck");
		t3.setName("save");
		
		t2.setDaemon(true); 		// Daemon used to work as background thread it will always terminated after the main thread
									//here t1 is main because we haven't mentioned it as daemon
		t3.setDaemon(true);
		
		t2.setPriority(1);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}

	
}
class Kode extends Thread {
	public void run() {
		String s1 = Thread.currentThread().getName();
		if(s1.equals("Type")) {
			typing();
		}else if(s1.equals("SpellCheck")) {
			spellCheck();
		}
		else {
			saving();
		}
	}
	public void typing() {
		System.out.println("Typing Started.....");
	
	for(int i = 0 ;i< 10 ;i++) {
		System.out.println(" Typing....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	System.out.println("Typing Terminated...");
}

	public void spellCheck() {
		System.out.println("SpellCheck Started.....");
		for(;;) {
			System.out.println(" Spell Check....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public void saving() {
		System.out.println("Save Started.....");
		for(;;) {
			System.out.println(" Saving....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}