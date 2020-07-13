package com.syntax.class18;

public class InstanceVariables {

	String name="Jame";// Instance Variable
	
	public static void main(String[] args) {
		
		String name="Kristina"; // Local Variable 
		System.out.println(name);
		
		// we create an Object or instanciate a class -> InstanceVariables
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.name);
		
		// Change the value from Kristinia to Castro changing value of the local variable 
			
			name="Castro";
			System.out.println(name);
			
			// Would like to change Jane to Ed --> changing value of InstanceVariables
					obj.name="Ed";
					System.out.println(obj.name);// New value of instance variable 
	}	

}
