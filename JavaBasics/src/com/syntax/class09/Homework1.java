package com.syntax.class09;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int start;
		int sumOdd = 0; 
		int sumEven = 0;
		int end = 0;
		
		System.out.println("Please enter a starting number");
		start = scan.nextInt();
		
		System.out.println("Please enter a ending number");
		end = scan.nextInt();
		
		for (int i = start; i <= end +1; i++) {
			 if(i%2==0) {
				 sumEven+=i;
			 if(i%2==1) {
				 sumOdd +=1;
			 }
				 
				 System.out.println("The sum of even number is" + sumEven);
				 System.out.println("The sum of odd numbers is" +sumOdd);
				 
			 }
		}
	}

}
