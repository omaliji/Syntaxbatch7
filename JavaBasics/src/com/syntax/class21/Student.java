package com.syntax.class21;

public class Student {
	
	// Exercise I
	
String name, address;
	
	Student(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	void displayInfo() {
		System.out.println(name + address);
	}
	
	public static void main(String[] args) {
		
		
		Student obj = new Student("Ummar", " 1234 Alexandria Va, 22309");
		obj.displayInfo();
	}
}


