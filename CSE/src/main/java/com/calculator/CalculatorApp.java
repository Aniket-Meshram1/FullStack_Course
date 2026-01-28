package com.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Calculator App");
		System.out.println("Start Calculating the stuff");
		String st = sc.next();
		String [] statment = st.split("[+-*/ ]+");
		System.out.println(Arrays.toString(statment));
	}

}
