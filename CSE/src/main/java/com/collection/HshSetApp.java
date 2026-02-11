package com.collection;

import java.util.HashSet;

public class HshSetApp {
	public static void main(String [] args) {
		// it is efficient for fast Searching as it stores values in hash containers
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(null);
		hs.add(25);
		hs.add(75);
		hs.add(125);
		hs.add(175);
		
		System.out.println(hs);
	}

}
