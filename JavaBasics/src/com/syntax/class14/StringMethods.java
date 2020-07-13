package com.syntax.class14;

public class StringMethods {

	public static void main(String[] args) {

		String name = "Olga";// Literal
		String name1 = new String();
		name1 = "Olga";

		System.out.println(name);
		System.out.println(name1);

		// method of String class
		String school = "Syntax";
		System.out.println("--------------------.length() method---------");
		//tells how many characters are their in the string
		int size = school.length();
		System.out.println("The length of the String is ="+size);
		
		String greetings = "Hello Syntax";
		int sizeOfDifferentString = greetings.length();
		System.out.println(sizeOfDifferentString);
		
		System.out.println("--------------------.toUpperCase() method---------");
		
		String city = "Washington DC";
		String newCity = city.toUpperCase();
		System.out.println(newCity);
		
		System.out.println("--------------------.toLowerCase() method---------");
		
		String lowerCaseString = newCity.toLowerCase();
		System.out.println(lowerCaseString);
		
		System.out.println("--------------------.concat() method---------");
		
		String country = "USA ";
		String capital = "Washington DC";
		// + with Strings serves as concatenation operator
		// + with numbers serves as arithmetic operator 
		System.out.println(country + capital);
		System.out.println(country.concat(capital));
		
		int day=27;
		String month= " June ";
		
		System.out.println(day+month);
		System.out.println(month+day);
		//System.out.println(day.concat); we can't use because both values must string
		//System.out.println(month.concat(day)) complier error becasue variables are not the same
		
		System.out.println("--------------------.isEmpty() method---------");
		
		String str = " ";
		// if length of the String is =0 then its empty
		boolean isEmpty = str.isEmpty();
		System.out.println(isEmpty);
		
		String str1 = "";
		System.out.println(str1.isEmpty());
		
		System.out.println("--------------------.trim() method---------");
		
		String cat = "My cat name is Jessy";
		String dog = "             My dog name           Charly  ";
		
		System.out.println(cat);
		System.out.println(dog);
		
		// Trim
		
		System.out.println(cat.trim());
		System.out.println(dog.trim());

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
