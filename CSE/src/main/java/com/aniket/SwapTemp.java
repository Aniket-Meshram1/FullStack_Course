package com.aniket;

public class SwapTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int temp = a;
		 a = b;
		 b= temp;
		 System.out.println("a : "+a+"\nb : "+b);
		 
		 
		 int c= 10;
		 int d = 20;
		 c +=d;
		 d = c - d;
		 c = c - d;
		 System.out.println("c : "+c+"\nd : "+d);
	

	}

}
