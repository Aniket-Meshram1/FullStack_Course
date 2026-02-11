package com.forEach;

import java.util.ArrayList;

public class ForEachCollection {

	public static void main(String[] args) {
		ArrayList lh = new ArrayList();
		lh.add(100);
		lh.add(50);
		lh.add(150);
		lh.add(25);
		lh.add(75);
		lh.add(125);
		lh.add(175);
		System.out.println(lh);
		
		for(int i = 0 ; i < lh.size() ; i++) {
			System.out.print(lh.get(i)+" ");
		}
		System.out.println();
		System.out.println("For Each");
		for(Object n : lh) {
			System.out.print(n+" ");
		}
	}

}
