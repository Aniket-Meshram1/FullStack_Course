package com.legacyClass;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListApp {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		for(int i = 0 ; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("ForEach Loop");
		for(Object n : ll) {
			System.out.println(n);
		}
		
		System.out.println("Iterator");
		
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("List Iterator");
		
		ListIterator li = ll.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("Reverse");
		ListIterator li1 = ll.listIterator(ll.size());
		while(li1.hasPrevious()) {
			System.out.println(li1.previous());
		}
		System.out.println("Descending iterator");
		Iterator it1 = ll.descendingIterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		
		// Enumeration is not supported in LinkedList 
//		Enumeration el = ll.element();
//		while(el.hasMoreElements()) {
//			System.out.println(el.nextElement());
//		}
		
	}

}
