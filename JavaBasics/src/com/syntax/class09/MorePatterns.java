package com.syntax.class09;

public class MorePatterns {
	public static void main(String[] args) {

		// Print these number 3 times
		// 12345
		// 12345
		// 12345

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print("y");
			}

			System.out.println();
		}

		System.out.println("*****************************************");

		// Try to print this pattern
		// 11111
		// 22222
		// 33333
		// 44444

		for (int row = 1; row <= 1; row++) {
			for (int col = 1; col <= 5; col++) {
				System.out.print(row);
			}

			System.out.println();
		}

		System.out.println("*****************************************");

		for (double i = 00; i <= 10000; i++) {
			System.out.println(i);
		}

		System.out.println("*****************************************");

		for (int i = 0; i <= 9; i++) {

			for (int j = 0; j <= 9; j++) {

				for (int k = 0; k <= 9; k++) {
					
					for (int m = 0; m <= 9; m++) {
						
					}

				}

				
				System.out.println(i + "" + j + "" + k + m);
			}

		}
	}

}
