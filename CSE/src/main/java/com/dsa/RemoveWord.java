package com.dsa;

import java.util.StringTokenizer;

public class RemoveWord {

	public static void main(String[] args) {
		String str = "Aniket Someshwar Meshram";
		String target = "Someshwar";
		System.out.println(remove(str,target));
		

	}
	public static String remove(String str,String target) {
		String [] st = str.split("\\s+");
		StringBuilder sb = new StringBuilder();
		
		for(String s : st) {
			if(s.equalsIgnoreCase(target)) {
				continue;
			}else {
				sb.append(s);
				sb.append(" ");
			}
			
		}
		return sb.toString().trim();
	}

}
