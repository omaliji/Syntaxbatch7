package com.syntax.class15;

public class ClassTask {

	public static void main(String[] args) {

//Create a String that will hold a sentence. Write a program to get a new String without any spaces.		
String me="I am an expert tester";
		
		String str = "Hello";
		
				
		me = me.replace("expert", "skilled");
		System.out.println(me);
		
		//Create a String that should be combination of letters, numbers and special characters.
		//Find out how many alpha characters are there in the String.
		
		String omar = "bye123456 family 987654";
		omar = omar.replaceAll("[6-9]", "");
		System.out.println(omar);
		
		String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
		
		String[] array =str. split("[?]");
		int sentences= array.length;
		System.out.println("Total number of sentences is" + sentences);
	}

}
