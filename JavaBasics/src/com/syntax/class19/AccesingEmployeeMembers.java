package com.syntax.class19;

public class AccesingEmployeeMembers
{

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.lastName ="Fatima";
		emp.name = "Khan";
		emp.age = 36;
		emp.salary=100000;
		//emp.ssn--> won't be available because it's private 
	}

}
