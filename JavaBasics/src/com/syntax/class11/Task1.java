package com.syntax.class11;

public class Task1 {

	public static void main(String[] args) {
//
//		String[] cars = { "Corolla", "Honda", "Benz", "Luxes", "BMW", "Saracha" };
//		// Print all the fruits in two different ways
//
//		for (String element : cars) {
//			System.out.println(element);
//		}
//
//		// Create an array on intergers and calculate
//		// the su of all elements in the arry
//
//		int[] numbers = { 23, 56, 73, 16, 80, 70, 39 };
//		int sum = 0;
//		
//		for (int num :numbers) {
//			sum+= num;
//		}
//          System.out.println("The sum of all number is: " + sum);
//          
//          // Second way using for loop
//          
//          int total = 0;
//          for (int i =0; i<numbers.length; i++) {
//        	  int num = numbers[i];
//        	  total += num;
//        	
//        	  
//          }
//          System.out.println("The total of all numbers is: " + total);

		// Task 3: Creat an array of countries
		// While retrieving all values from an array print capital of the country

		String[] countries = { "Tajikistan", "Brazil", "Gambia", "US", "Pakistan" };

		for (String country : countries) {
			if (country.contentEquals("Albania")) {
				System.out.println("Tirana");
			} else if (country.equals("Brazil")) {
				System.out.println("Brasilia");
			} else if (country.equals("US") || country.equals("USA")) {
				System.out.println("Washington DC");
			} else if (country.equals("Tajikistan")) {
				System.out.println("Dushanbe");
				;
			} else if (country.equalsIgnoreCase("Gambia")) {
				System.out.println("Banjul");
			} else {
				System.out.println("The country " + country + " is not in my list");
			}
		}
		
		System.out.println("2nd way");
		
		for (int i=0; i<countries.length;i++) {
			
			switch(countries[i]) {
			case "Tajikistan":
				System.out.println ("Dushamba");
				break;
			case "US":
			case "USA":
				System.out.println("Washington DC");
				break;
			case "Brazil":
			    System.out.println("Brasilia");
			     break;
			case "Albania":
				System.out.println("Tirana");
				break;
			case "Gambia":
				System.out.println("Banjul");
				break;
				
			default:
				System.out.println("Not in my list");
				
		//Elion way
				
				String[] capitalCities = { "Tajikistan", "Brazil", "Gambia", "US", "Pakistan"};
				for (int a = 0; i < countries.length; a++) {
					String country = countries[a];
					String city = capitalCities[a];
					System.out.println("The capital city of " + country + " is " + city);
   }
			
			
		
		}
			
			
			
		}
	}
}
