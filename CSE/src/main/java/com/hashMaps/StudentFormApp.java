package com.hashMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class StudentFormApp {

	public static void main(String[] args) {
		StudentForm s1= new StudentForm("Aniket", 21, "Male", "9322688979", 68, 7, "aniket@ggmail.com", "abc road nagpur", 5.11f, 51, "B+");
		StudentForm s2 = new StudentForm("Aftab", 22, "Male", "9874563210", 90, 6, "aftab2@gmail.com", "xyz road nagpur", 5.7f, 75, "AB+");
		StudentForm s3 = new StudentForm("Danish", 23, "Male", "9874585210", 85, 6, "danish@gmail.com", "mno road nagpur", 5.5f, 65, "A+");
		HashMap map = new HashMap();
		map.put(1, s1);
		map.put(2, s3);
		map.put(3, s2);
		System.out.println(map);
		
		LinkedHashMap lm = new LinkedHashMap();
		
		lm.put(1, s1);
		lm.put(2, s3);
		lm.put(3, s2);
		System.out.println(lm);
		TreeMap tm = new TreeMap();
		tm.put(3,s3);
		tm.put(1, s1);
		tm.put(2, s2);
		System.out.println(tm);
	}	

}
