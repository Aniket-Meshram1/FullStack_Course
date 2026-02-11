package com.dsa;

public class ReverseWord {

	public static void main(String[] args) {
		
String str = "Aniket";
System.out.println(reverse(str));
	}
	public static String reverse(String str) {
		StringBuilder sb = new StringBuilder();
		for(char s : str.toCharArray()) {
			sb.append(s);
		}
		return sb.reverse().toString();
	}

}
