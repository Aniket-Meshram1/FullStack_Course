package com.legacyClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteApp {

	public static void main(String[] args) {

		
			CopyOnWriteArrayList al = new CopyOnWriteArrayList();
			al.add(10);
			al.add(20);
			al.add(30);
			al.add(40);
			al.add(50);
			
			Iterator itr  = al.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				al.add(75);
			}
			
			
	}

}
