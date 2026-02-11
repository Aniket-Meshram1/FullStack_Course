package com.legacyClass;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayDequeApp {

	public static void main(String[] args) {
	ArrayDeque ad = new ArrayDeque();
	ad.add(10);
	ad.add(20);
	ad.add(30);
	ad.add(40);
	ad.add(50);
	
	// ArrayDeque does not support For loop
	
//	for(int i = 0 ; i < ad.size(); i++) {
//		System.out.println(ad.get(i));
//	}
	
	System.out.println("ForEach Loop");
	for(Object n : ad) {
		System.out.println(n);
	}
	
	System.out.println("Iterator");
	
	Iterator it = ad.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		
	}
	
//	ListIterator is not supported in ArrayDeque
	
//	System.out.println("List Iterator");
//	
//	ListIterator li = ad.listIterator();
//	while(li.hasNext()) {
//		System.out.println(li.next());
//	}
//	System.out.println("Reverse");
//	ListIterator li1 = ad.listIterator(ad.size());
//	while(li1.hasPrevious()) {
//		System.out.println(li1.previous());
//	}
	System.out.println("Descending iterator");
	Iterator it1 = ad.descendingIterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
	
	
	// Enumeration is not supported in ArrayDeque 
//	Enumeration el = ll.element();
//	while(el.hasMoreElements()) {
//		System.out.println(el.nextElement());
//	}
	
	}

}
