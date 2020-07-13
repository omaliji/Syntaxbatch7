package com.syntax.class04;

public class HomeWork01 {

	public static void main(String[] args) {

		boolean isDiploma = false;
		boolean isDegree = true;
		double gpa = 3.7;

		if (isDiploma) {
			System.out.println("Congratulations");
		} else {
			System.out.println("Get a degree");

		}
		if (isDegree) {
			if (gpa > 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied hard");
			}

		}
	}

}
