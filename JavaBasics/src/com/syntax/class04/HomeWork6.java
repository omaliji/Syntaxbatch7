package com.syntax.class04;

import java.util.Scanner;

public class HomeWork6 {
	
	//Create a Java program that will ask user to input city and temperature. 
	//Your program should convert Fahrenheit into celsius and print 
	//“The temperature is the city __ is __”

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("What is your city name?");
		
		String city = scan.next();
		System.out.println("What is the temperture?");
		
		int temp =scan.nextInt();
		int tempCel = (temp-32)*5/9;
		
		System.out.println("The temperature in the City " +city+" is "+tempCel+ ".");
		
	
		
		
		
	
		
	}
}
