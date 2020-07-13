package com.syntax.class05;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your height");
		int age = scan.nextInt();
		
		if (age > 0 && age <= 60) {
			System.out.println("You are short");
		} else if (age > 60 && age <= 72) {
			System.out.println("You are medium"); 
		} else if (age >72 && age <= 100) 
			System.out.println("You are tall"); 
	}

}


