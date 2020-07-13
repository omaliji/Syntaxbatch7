package com.syntax.class09;

public class NestedLoop {

	public static void main(String[] args) {

		// Let's print the clock
		//00:00
		//00:01
		//...
		//01:00
		//01:01
		//...
		//23:58
		//23:59
		//Hour goes from 0 to 23
		//minute goes from 0 to 59
		
		for (int h = 0; h<24; h++) {
			
			for (int m = 0; m<60; m++) {
			
			 for (int s= 0; s<60;s++) {
				 
			 }
				
				int s = 0;;
				System.out.println(h +":" + m + ":" + s );
			}
		}
	}

}
