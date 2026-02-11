package com.forEach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorInJava {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(50);
		list.add(150);
		list.add(25);
		list.add(75);
		list.add(125);
		list.add(175);

		Iterator itr = list.iterator();
		System.out.println("Iterator...");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		System.out.println("List Iterator..");
		
		Iterator itr1 = list.listIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		
		
		System.out.println("Reverse List Iterator");
		ListIterator itr2 = list.listIterator(list.size());
		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
			
		}
		
		
		
		
	}

}
