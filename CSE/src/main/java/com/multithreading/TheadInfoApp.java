package com.multithreading;

public class TheadInfoApp {

	public static void main(String[] args) {
	Thread t =  Thread.currentThread();
	t.setName("PCE");
	t.setPriority(1);
	System.out.println(t);
	duty();
	

	}
	// Here we have Only Single Thread so in both calls we will get the same output.
	static void duty() {
		Thread t =  Thread.currentThread();
		System.out.println(t);
	}

}
