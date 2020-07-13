package com.syntax.class14;

public class StringMethodsContinue {

	public static void main(String[] args) {

//		System.out.println("--------------------.contains() method---------");
//
//		String str = "Good Afternoon all";
//		String searchValue = "afternoon";
//
//		boolean contains = str.contains("afternoon");
//		System.out.println(contains);
//		
//		String searchValue1="good";
//		boolean isITthere=str.contains(searchValue1);
//		System.out.println(isITthere);
//		
//		System.out.println(str.contains("A"));
//		
//		System.out.println("--------------------.startswith() method---------");
//		
//		
//		String drink="water";
//		boolean starts=drink.startsWith("w");
//		
//		
//		
//		System.out.println("--------------------.endswith() method---------");
//
//		boolean ends = drink.endsWith("a");
//		System.out.println(ends);
		
		String str1 = "Hello Mohammad";
		String str2 = "Hello Bulat";
		
		System.out.println(str1.startsWith("Hello"));
		System.out.println(str2.endsWith("Bulat"));
		
		System.out.println("--------------------.equals() method---------");
		
		String String1 = "Saturday";
		String String2 = "Saturday";
		
		boolean equality =String1.equals(String2);
		System.out.println(equality);
		
		boolean equalityNoCase= String1.equalsIgnoreCase(String2);
		System.out.println(equalityNoCase);
		
		String expected= "Password cannot be empty";
		String actual ="Password can not be empty";
		
		if(expected.equals(actual)) {
			System.out.println("Test pass");
			
		} else {
			System.out.println("Test Fail");
		}
		
		// Real example of IgnoreCase
		
		String expectedBrowser= "Chrome";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
