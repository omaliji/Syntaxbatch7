package com.syntax.class04;

import java.util.Scanner;

public class HomeWork3 {
 public static void main (String [] args) {
	 
	 
	 
	 //You are DMV representative and you need to 
	 //ask customer their age. If they are 18 and older
	  //you will issue a driver license to them,
	  //otherwise you will offer them to get 
	 //a learners permit.
	 
	 
	 System.out.println("Please write some text and press enter");
	 
	 

	 Scanner scan =new Scanner(System.in);
	 System.out.println("Please enter your age");
	 int age = scan.nextInt();
	 
	 if (age>= 18) {
		 System.out.println("A driver license will be issued to you");
	 }else {
		 System.out.println("You will get your learner permit");
	 }
	 
 }
 }
