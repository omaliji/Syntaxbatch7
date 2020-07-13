package com.syntax.class18;

public class House {

	public static void main(String[] args) {
		
		Cat cat1=new Cat();
		cat1.name = "Jessy";
		cat1.age =8;
		cat1.color ="grey";
		System.out.println("Number of paws="+Cat.paws);
		
		Cat cat2 = new Cat();
		cat2.name = "Lucy";
		cat2.age =1;
		cat2.color ="white";
		cat2.name="Bonchuk";
		cat2.mustache=false;
		
		System.out.println("Name of the cat is "+cat1.name);
		System.out.println("Name of the cat is "+cat2.name);
		
		cat1.displayCat();
		
		cat2.displayCat();
		cat1.displayCommonFeatures();
	}

}
