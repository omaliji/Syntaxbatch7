package com.syntax.class17;

public class MethodsWithReturn {
	
	public static void main(String[] args) {
		
		MethodsWithReturn obj = new MethodsWithReturn();
		boolean isItEven =obj.isEven(12);
		System.out.println(isItEven);
	}
	
	// create  a method that will accept an int value and return whether the number is even
	
	boolean isEven (int a ) {
		
		boolean even;
		
		if(a%2==0) {
			even = true;
		}else {
			even = false;
			
		}
		
		return even;
	}
	
	
	// create a method to accept two int value and return the largest number
	
	int getLargest(int a, int b) {
		int largest;
		
		if (a>b) {
			largest = a;
		}else {
			largest =b;
		}
		
		return largest; // return value must be same type as Return that we declared in method header
	}

		// create a method that will accept String value and return that calue all in UpperCase
	
		String convertToUpperCase(String value) {
			return value.toUpperCase();
			
			String upperValue = obj.convertToUpperCase("Thao");
			System.out.println(upperValue);
			
			
			
			}
			
		}

	
	
	
	
	
	

