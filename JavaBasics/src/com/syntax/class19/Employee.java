package com.syntax.class19;

public class Employee {
	
	public static String company;// any class from any package in the project can access 
	public String name, lastName;// any class from any package in the project can access 
	protected int age;
	double salary; // default
	private long ssn;
	
	public static void displayCompany() {
		System.out.println("Employee works at "  + company);
	}
		
		public void displayName() {
			System.out.println("Employee name is "+ name + " " + lastName); 
		}
		
		protected void displayAge() {
			System.out.println("Employee is "+age+" years old");
		}
		
		void displaySalary() {
			System.out.println("Employee salary is " + salary);
			
			
		}
		
		private void displaySsn() {
			System.out.println("Employee ssn is " +ssn);
			
			
		}
		
		public static void main(String[] args) {
			company="Google";
		Employee emp =	new Employee();
		emp.name ="Mohammad";
		emp.lastName ="Maaliji";
		emp.age=32;
		emp.salary = 1245400;
		emp.ssn= 9876543210l;
		
		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
		emp.displaySsn();
		}
}

