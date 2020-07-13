package com.syntax.class10;

public class ArrayIntro {

	public static void main(String[] args) {

//		int num1 = 10;
//		int num2 = 15;
//		int num3 = 20;
//		int num4 = 25;

		char[] grade = new char[6];
		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = 'F';

		System.out.println(grade[1]);

		System.out.println("===========================");

		char[] grade2 = {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(grade2[1]);
		
		System.out.println("=========================");
		
	String[] names= {"John","Khan","Mama","Kaka"};
	System.out.println(names[2]);
	
	System.out.println("==========================");
	
	String[] name = new String[4];
	names[0]= "Tahmina";
	names[1]=  "Baheej";
	names[2]=  "Mohammad";
	names[3]= "Haroon";

    System.out.println(names[0]);
    
    // create an arrary of 4 intergers and see the default value
}}
