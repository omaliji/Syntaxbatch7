package com.syntax.class05;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {
		
		Scanner myScanner =new Scanner(System.in);
		
		System.out.println("Please enter");
		int num = myScanner.nextInt();
		System.out.println(num);
		
		System.out.println("Please enter a double");
		double d = myScanner.nextDouble();
		System.out.println(d);
		
		System.out.println("Please enter if omar is happy");
		boolean b = myScanner.nextBoolean();
		System.out.println(b);
		
		System.out.println("Please enter Omar's name");
		char myChar = myScanner.next().charAt(0);
		System.out.println(myChar);
		myScanner.close();
		
		
		
		
		
	}

}
