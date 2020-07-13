package com.syntax.class20;

public class Car {
	
	public static String make;
	public static String model;
	private double price;
	int year;
	
	public void displayInfo() {
		System.out.println("We build "+year + " " + make+" " +model+" for price = $" + price);
	}
	
	public static void main (String[]args) {
		Car car = new Car();
		/*  Car --> class name
		 *  car --> reference variable
		 *  new --> Keyword
		 *  Car();--> calling constructor
		 */ 
		car.displayInfo();

		System.out.println(car.model);
		
		String driver;
		//System.out.println(driver);
}

}