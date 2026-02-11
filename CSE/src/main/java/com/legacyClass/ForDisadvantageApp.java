package com.legacyClass;

import java.util.ArrayList;
import java.util.Iterator;

public class ForDisadvantageApp {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(int i = 0 ; i < al.size(); i++) {
			System.out.println(al.get(i));
//			al.add(i);    here read and write action performing at same time, which for loop can not handles and it will run infinitely .
			
		}
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			al.add(25);
		}
		
		
		
	}

}
