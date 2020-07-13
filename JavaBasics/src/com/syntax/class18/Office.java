package com.syntax.class18;

public class Office {

	public static void main(String[] args) {
		Employee employee1=new Employee();
		employee1.CEO = "Mohammad";
		employee1.salary =10000;
		employee1.eID =0001;
		
		System.out.println("Name of the CEO is "+employee1.CEO);
		System.out.println("Employee eID is "+employee1.eID);
		System.out.println("Employee salary is "+employee1.salary);
		
	}

}
