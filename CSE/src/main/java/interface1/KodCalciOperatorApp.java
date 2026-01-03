package interface1;

import java.util.Scanner;

public class KodCalciOperatorApp {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int num2;
		int c;
		System.out.println("Welcome to calci ");
		System.out.println("Enter the num1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter the Operator (+,-,*,/)");
		String op = sc.next();
		sc.nextLine();
		switch(op) {
		case "+":
			System.out.println("Enter the num2");
			 num2 = sc.nextInt();
			new BSoftware(num1, num2).add();
			
			break;
		case "-":
			System.out.println("Enter the num2");
			 num2 = sc.nextInt();
			 new BSoftware(num1, num2).sub();
			break;
		case "*":
			System.out.println("Enter the num2");
			num2 = sc.nextInt();
			c = num1*num2;
			new BSoftware(num1, num2).mul();
			break;
		case "/":
			System.out.println("Enter the num2");
			num2 = sc.nextInt();
			c = num1/num2;
			new BSoftware(num1, num2).div();
			break;
		default:
			System.out.println("Enter the valid Operator");
		}
		
	}

}
