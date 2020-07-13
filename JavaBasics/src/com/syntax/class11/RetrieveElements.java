package com.syntax.class11;

public class RetrieveElements {
	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D', 'F' };

		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);

			System.out.println("===============================");

			// Print using Advanced Loop

			for (char element : grades) {
				System.out.println(element);
			}

		}

		String[] fruits = { "Apple", "Orange", "Grapes", "Banana", "Cucumber" };
		// Print all the fruits in two different ways

		for (String element : fruits) {
			System.out.println(element);
			
			System.out.println("===================");

			// Another way

			for (int i = 0; i < fruits.length; i++) {
				
			System.out.print(fruits[i] + " ");
		}
	}

}
}