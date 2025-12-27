package com.dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ans("Anniket");

	}
	
	public static void ans(String str) {
		Map<Character,Integer> map = new HashMap<>();
		for(char ch :str.toCharArray()) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer> set :map.entrySet()) {
			System.out.println(set.getKey()+":"+set.getValue());
		}
		
	}

}
