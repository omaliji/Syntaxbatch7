package com.syntax.class04;

public class NestedIf {
	public static void main(String[] args) {
		boolean isMorning = true;
		boolean isSchool = false;
		int time = 20; //8pm
		
		if (isMorning) {
			System.out.println("Good Morning");
			 
			 if (isSchool) {
				 System.out.println("Friends"); 
				 } else { 
					 System.out.println("Family");
				 }
			         System.out.println("bye"); 
			         
		         } else { 
		        	 System.out.println("It is not mroning");
		        	 
		        	 if (time < 18) {
		        		  System.out.println("Good afternoon"); 
		        		  
		        	 } else {
		        		 System.out.println("Good evening");
		        		 
		        		 System.out.println("Vika has no question");
			 }
		}
	}
	
		
		
				  }
					  
		