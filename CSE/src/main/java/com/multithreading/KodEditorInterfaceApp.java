package com.multithreading;

public class KodEditorInterfaceApp {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Application Started.....");
		Thread t1 = new Thread(new Typing());
		Thread t2 = new Thread(new SpellCheck());
		Thread t3 = new Thread(new Saving());
		t1.start();
		t2.start();
		t3.start();
		
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Application Terminated.....");
	}

}

/// Achieving MultiThreading by implementing Runnable interface
class Typing1 implements Runnable{
	public void run() {
		System.out.println("Typing Started.....");
		for(int i = 0 ;i< 10 ;i++) {
			System.out.println(i+" Typing....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Typing Terminated...");
	}
}
class SpellCheck1 implements Runnable{
	public void run() {
		System.out.println("SpellCheck Started.....");
		for(int i = 0 ;i< 10 ;i++) {
			System.out.println(i+" Spell Check....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("SpellCheck Terminated.....");
	}
}
class Saving1 implements Runnable{
	public void run() {
		System.out.println("Save Started.....");
		for(int i = 0 ;i< 10 ;i++) {
			System.out.println(i+" Saving....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Save Terminated.....");
	}
}
