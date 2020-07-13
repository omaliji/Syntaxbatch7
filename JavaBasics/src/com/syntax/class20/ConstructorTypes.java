package com.syntax.class20;

public class ConstructorTypes {

	ConstructorTypes(){
		System.out.println("I am a constructor");
	}
	
	ConstructorTypes (String str){
		System.out.println("I am  a constructor with 1 parameter");
	}
	
	public static void main(String[]args) {
		
		ConstructorTypes obj = new ConstructorTypes();
		System.out.println("I am a code inside the main method");
		
		
	}
}
