package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Please write some text and press enter");
		String text = scan.nextLine();
		System.out.println("____________________");
		System.out.println(text);
				
		// let me read an integer
		
		int age = scan.nextInt();
		System.out.println("The age that you entered is " + age);
		int a = 32;
		int a1 = scan.nextInt();
		System.out.println("Please enter your age");
		
		
		System.out.println("Please enter your age and also your sex");
	}

}
