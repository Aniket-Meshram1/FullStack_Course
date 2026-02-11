package com.forEach;

public class ForEachLoopApp {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		for(int n: arr) {
			System.out.println(n);
		}
		
		
		String st = "Aniket";
		for(char ch : st.toCharArray()) {
			System.out.println(ch);
		}

	}

}
