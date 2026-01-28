package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrList {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add("Aniket");
		list1.add('A');
		list1.add(true);
		System.out.println(list1);
		ArrayList list2 = new ArrayList();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add("Aniket");
		list2.add('A');
		list2.add(true);
		System.out.println(list2);
		list1.add(0, 'B');
		list1.addAll(3, list2);
		System.out.println(list1);
		list1.addAll(list2); // concatenate two list
		System.out.println("List 1 --> "+list1);
		System.out.println(list1.containsAll(list2));
		list1.remove(1);// removes element from Particular index
		list1.retainAll(list2);// IT gives only common data in both lists
		System.out.println("RETAIN "+list1);
		
	}

}
