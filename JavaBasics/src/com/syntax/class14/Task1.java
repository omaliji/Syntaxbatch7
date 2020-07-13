package com.syntax.class14;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your username:");
		String username = scanner.nextLine();
		System.out.println("Please enter your password:");
		String password = scanner.nextLine();
		System.out.println("Please confirm your password:");
		String confirmPassword = scanner.nextLine();
		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("Username or Password cannot be empty");
		} else if (password.length() < 8) {
			System.out.println("Password is to short");
		} else if (password.contains(username)) {
			System.out.println("Password cannot contain Username");
		} else if (!password.equals(confirmPassword)) {
			System.out.println("Password do not match");
		} else {
			System.out.println("Your username and password have been created");
		}
		
		scan.close();	

	}
}
