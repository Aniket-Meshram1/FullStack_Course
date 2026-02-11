package com.collection;

import java.util.TreeSet;

public class TreeSetApp {

	public static void main(String[] args) {
		// in treeSet regardless of input the out[put is always in sorted order
		TreeSet ts  = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);
		System.out.println("-----------------");
		System.out.println("Ceiling Values");
		
		System.out.println(ts.ceiling(75));
		System.out.println("-----------------");
		System.out.println(ts.ceiling(70));
		System.out.println("-----------------");
		
		System.out.println("Floor Values");
		
		System.out.println(ts.floor(75));
		System.out.println("-----------------");
		System.out.println(ts.floor(70));
		System.out.println("-----------------");
		
		System.out.println("Lower Values");
		
		System.out.println(ts.lower(75));
		System.out.println("-----------------");
		System.out.println(ts.lower(70));
		System.out.println("-----------------");
		
		System.out.println("Higher Values");
		System.out.println(ts.higher(75));
		System.out.println("-----------------");
		System.out.println(ts.higher(70));
		System.out.println("-----------------");
		
		System.out.println(ts);
		
		System.out.println("Head Set");
		System.out.println(ts.headSet(75));
		System.out.println("Tail Set");
		System.out.println(ts.tailSet(75));
	}

}
