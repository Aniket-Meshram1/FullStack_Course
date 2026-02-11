package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class PassengerApp {

	public static void main(String[] args) {
		PassengerDetails p1 = new PassengerDetails(1000, "John Doe","Nagpur","Pune", "RoadWays");
		PassengerDetails p2 = new PassengerDetails(1004, "Mike Smith", "Nagpur", "Pune", "RailWays");
		PassengerDetails p3 = new PassengerDetails(1002, "David Harber", "Nagpur", "Pune", "RailWays");
		PassengerDetails p4 = new PassengerDetails(1003, "John cena", "Nagpur", "Pune", "AirWays");
		ArrayList al = new ArrayList();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
