package com.syntax.class03;

public class Homework {
	// write a Java program to add, subtract, multiply and divide 2 decimal values
	// Your program should say. "The ______ of 2 numbers __ and __ is equal to ___"
	// 
	// Write a program to print the area and preimeter of a rectangle 
	//with width = 5 and hight = 8. Your program should say " The perimeter of a rectangle with 
	
		public static void main (String [] args) {
			double num1 = 3.5, num2 = 4.2;
			
			double sum = num1 + num2;
			double sub = num1 - num2;
			double mult = num1 * num2;
			double div = num1 / num2;
			
			System.out.println("The addition of 2 numbers " + num1 + " and " + num2 
					+" is equal " + sum);
			
			System.out.println("The multiplication of 2 numbers " + num1 + " and " + num2 
					+" is equal " + mult);
			
			System.out.println("The subtraction of 2 numbers " + num1 + " and " + num2 
					+" is equal " + sub);
			
			System.out.println("The division of 2 numbers " + num1 + " and " + num2 
					+" is equal " + div);
			
			System.out.println("***********************************************************************");
			
			
			
		}
	

}
