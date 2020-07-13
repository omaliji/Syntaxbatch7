package com.syntax.class11;

public class RetrievingValuesFromTwoDArrays {
	public static void main(String[] args) {

		// Put the months for each season in one row

		String[][] months = { { "December", "January", "February" }, { "March", "April", "May" },
				{ "June", "July", "August" }, { "September", "October", "November" } };

		int seasons = months.length; // how many arryas are inside, how many rows

		System.out.println(seasons + " seasons");

		int winterLength = months[0].length;
		System.out.println(winterLength + " months in winter/row 0");

		int lastRowSize = months[3].length;

		// Nested loops are married (joke) to 2D Arrays
		for (int i = 0; i < months.length; i++) {// interating over rows
			
			for (int j= 0;j<3; j++) { // interating over columns
				
						System.out.println(months[i][j]);
				
			}
            
		}

	}
}
