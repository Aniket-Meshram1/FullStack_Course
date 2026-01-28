package com.collection;

import java.util.LinkedList;

public class LinkedListApp {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("Aniket");
		list.add('A');
		list.add(true);
		
		System.out.println(list);
		
		System.out.println(list.get(4));
		 
		list.push(25);
		list.push('B');
		System.out.println(list);
		
		System.out.println(list.pop());
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		System.out.println(list.poll());
		System.out.println(list);
	}

}
