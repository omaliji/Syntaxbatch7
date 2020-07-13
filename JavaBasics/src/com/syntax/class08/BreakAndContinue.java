package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
//		// We are counting from 1-10
//		// We want to stop the loop when we reach 4
//		
//		for(int i = 1; i<=10; i++) {
//			System.out.println(i);
//			if (i==4) {
//				break;
//			}
//			
			for (int k =1; k<=50; k++) {
				if (k%3==0) {
					continue;
				}
				System.out.println(k);
			}
		}

	}


