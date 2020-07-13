package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		// capture the name from the user and print
		// Your nameis -----------
		
		// Ask the user to enter the age and print
		// Your name is ----- and age ------
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your full name");
		String name = input.nextLine();
		System.out.println(" Your name is" + name);
		
		System.out.println("Please enter your age!");
		
		double afhaniAge = input.nextDouble();
		System.out.println("Your name is " + name + " and age is " + afhaniAge);
		
		
	}

}
