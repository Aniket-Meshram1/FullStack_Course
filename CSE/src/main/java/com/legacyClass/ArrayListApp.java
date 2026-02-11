package com.legacyClass;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListApp {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(int i = 0 ; i < al.size(); i++) {
			System.out.println(al.get(i));
			
		}
		
		System.out.println("ForEach Loop");
		for(Object n : al) {
			System.out.println(n);
		}
		
		System.out.println("Iterator");
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("List Iterator");
		
		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("Reverse");
		ListIterator li1 = al.listIterator(al.size());
		while(li1.hasPrevious()) {
			System.out.println(li1.previous());
		}
		
		
	}

}
