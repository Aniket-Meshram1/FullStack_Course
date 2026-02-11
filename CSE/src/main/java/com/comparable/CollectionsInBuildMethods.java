package com.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsInBuildMethods {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		 al.add(100);
		 al.add(50);
		 al.add(150);
		 al.add(75);
		 al.add(125);
		 al.add(175);
		 System.out.println(al);
		 
		 Comparator c = Collections.reverseOrder();
		 Collections.sort(al,c);
		 System.out.println(al);
		 Collections.sort(al);
		 System.out.println(al);
		 
		 System.out.println(Collections.binarySearch(al, 175));
		 Collections.rotate(al, 3);
		 System.out.println(al);
		 System.out.println(Collections.min(al));
		 System.out.println(Collections.max(al));
		 System.out.println(Collections.frequency(al, 150));
		 System.out.println(Collections.replaceAll(al, 75, 90));
		 System.out.println(al);
		 Collections.shuffle(al);
		 System.out.println(al);

	}

}
