package com.syntax.class16;

public class CalculatorTest {

	public static void main(String[] args) {
		
		// call method add();
		
		Calculator a = new Calculator();
		a.add(100,200);
		a.add(10 ,20);
		a.add(1000  , 2000);
		
		a.sub(100, 50);
		a.sub(1000, 500);
		a.sub(7000, 5000);
	}

}
