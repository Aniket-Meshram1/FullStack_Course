package com.multithreading;

public class KodEditor {

	public static void main(String[] args) {
		Typing t1 = new Typing();
		SpellCheck t2= new SpellCheck();
		Saving t3 = new Saving();
		t1.start();
		t2.start();
		t3.start();

	}

}
class Typing extends Thread{
	public void run() {
		for(int i = 0 ;i< 10 ;i++) {
			System.out.println(i+" Typing....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
class SpellCheck extends Thread{
	public void run() {
		for(int i = 0 ;i< 10 ;i++) {
			System.out.println(i+" Spell Check....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
class Saving extends Thread{
	public void run() {
		for(int i = 0 ;i< 10 ;i++) {
			System.out.println(i+" Saving....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}