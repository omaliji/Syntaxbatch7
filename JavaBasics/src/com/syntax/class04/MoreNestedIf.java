package com.syntax.class04;

public class MoreNestedIf {
	
	public static void main(String[] args) {
		//Let's have a date of month and a day of week
		//if it's Friday --> we are going to watch a movie
		//					if date is 13 --> watch a scary movie
		//					if date is not 13 --> watch a comedy 
		// if it is not Friday --> we are going to study JAVA
		
		boolean isFriday = true;
		int date = 17;
		
		if (isFriday) {
			System.out.println("We are going to watch a movie"); 
			
			if (date == 13) {
				System.out.println("I will watch scary movive");
				
		} else { 
			System.out.println("I will watch funny movie");
		}
			System.out.println("It is Not Friday. I am going to study JAVA");
			
		}
		
		
			
			}
			 
			
		
		
		
	}


