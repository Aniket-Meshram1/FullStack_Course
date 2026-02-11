package com.dsa;

public class ReveseNo {

	public static void main(String[] args) {
	int num = 124;
	System.out.println(reverse(num));
	}
public static int reverse(int n) {
	int rev = 0;
	int rem = 0;
	while(n>0) {
		rem = n % 10;
		rev = rev*10 + rem;
		n /=10;
	}
	return rev;
}
}
