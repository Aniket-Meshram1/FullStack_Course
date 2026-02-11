package com.aniket;

public class CheckString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Arsh";
		String s2 = "Arsh";
	System.out.println(s1==s2); // True because Raw String stored in Constant pool
	System.out.println(s1.equals(s2));// true
	String s3 = new String("Arsh");
	System.out.println(s1==s3);  // False because it creates object in non constant pool
	System.out.println(s1.equals(s3)); //true
	String s4 = new String("Arsh");
		s1.concat(s4);
	System.out.println(s1);
	
//	
//	String str1 = new String("Abc");
//	String str2 = str1.intern();
//	String str3 = str1.intern();
//	System.out.println(str2==str3);
//	char a = 'U';
//	int b = a;
//	System.out.println(b);
	
	
	String st1 = "SACHIN";
	String st2 = "SAURAV";
	System.out.println(st1.compareTo(st2));  // if value is 0 then both string are same if -ve then String 2 is greater and for +ve value String 1 is greater
	System.out.println(st1.toLowerCase());
	
	
	}

}
