package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {
		int[] grades = new int[5];
		grades[4] = 90;
		int size = grades.length;
		System.out.println("array size is: " + size);

		grades[3] = 85;
		grades[2] = 92;
		grades[1] = 75;
		grades[0] = 100;

		// What is the average of this class
		int average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / size;
		System.out.println("Class average is: " + average);
		
		int total =0;
		for (int k=0; k<size; k++) {
			total += grades[k];
		}
		
		System.out.println("Class average is: " + total / size);
		
		
		
		
		
		
		
		System.out.println("===================================================");

		String[] cities = { "Fairfax", "Kiev", "Tampa", "Washington", "Arlington", "NYC", "Lorton", "Chicago" };
		// I live in Tampa
		int i = 1;
		System.out.println("I live in " + cities[2]);
		i += 2;
		System.out.println("I moved to " + cities[i]);
		int cityNumber = cities.length;
		System.out.println("Total number of cities is: " + cityNumber);
		System.out.println("The last city in the list is:" + cities[7]);
		System.out.println("--------------------------");
		// I want to print all the cities
		// cities[0], cities[1]........ cities[7]

		for (int j = 0; i < 8; j++) {
			System.out.println(cities[j]);
		}
	}
}
