package com.hashMaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashexampleApp {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(100, 99);
		hm.put(50, 999);
		hm.put(150, 9999);
		hm.put(25, 99999);
		hm.put(75, 999999);
		hm.put(150, 9999999);
		
		System.out.println(hm);
		
		System.out.println("---------Keys------------");
		Set s = hm.keySet();
		
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("---------Values----------");
	Collection cl= 	hm.values();
	Iterator itr = cl.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
				
	System.out.println("--------EntrySet-----------");
	Set es = hm.entrySet();
	Iterator itr2 = es.iterator();
	while(itr2.hasNext()) {
		System.out.println(itr2.next());
	}
	
	
	}

}
