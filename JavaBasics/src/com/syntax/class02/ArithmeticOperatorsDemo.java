package com.syntax.class02;

public class ArithmeticOperatorsDemo {
	
	public static void main(String [] args) {
		int num1 = 10;
		int num2 = 5;
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int div = num1 / num2;
		int mult = num1 * num2;
		
		System.out.println("addition ->" + num1 + num2);		
		
		
		System.out.println( "addition ->" + sum);
		System.out.println("subtraction ->" + sub);
		System.out.println("division ->" + div);
		System.out.println("multiplication ->" + mult);
		
		double d1 = 3.4;
		double d2 = 5.73;
		double dSum = d1 +d2;
		
		System.out.println("Double addition ->" + dSum);
		// you can store an integer as double
		double dSum2 = num1 + num2;
		System.out.println("dSum2 ->" + dSum2);
		
	}

}
