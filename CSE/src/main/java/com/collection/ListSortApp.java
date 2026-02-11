package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortApp {

	public static void main(String[] args) {
		ArrayList ts= new ArrayList();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		Collections.sort(ts);
		System.out.println(ts);
	}

}
