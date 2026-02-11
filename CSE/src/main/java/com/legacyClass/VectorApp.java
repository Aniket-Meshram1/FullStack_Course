package com.legacyClass;

import java.util.Enumeration;
import java.util.Vector;

public class VectorApp {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		// To access Each data from vector we need to convert each data into element.
		Enumeration el = v.elements();
		while(el.hasMoreElements()) {
			System.out.println(el.nextElement());
		}
	}

}
