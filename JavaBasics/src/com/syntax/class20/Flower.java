package com.syntax.class20;

import com.syntax.class7.ScannerAndLoop;

public class Flower {

	String type;
	// if you are not going to create a constructor, --> Complier will create one for you
	//Flower() {// default non argument 
	//
	//}
	
	Flower(){
		System.out.println("I am pointless constructor");
	}

	Flower(String flowerType) {
		type = flowerType;
		
			
		}
	public static void main(String[] args) {

		
		Flower flower = new Flower();
		System.out.println(flower.type);
		
		Flower flower2=new Flower("Tulip");
		System.out.println(flower2.type);
		
	
	}

}
