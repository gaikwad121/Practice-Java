package com.Practice;

import java.util.Scanner;

public class Practice2 {

	
	    public static int convertToGradePoint(int score) {
	        if (score >= 90) return 10;
	        else if (score >= 80) return 9;
	        else if (score >= 70) return 8;
	        else if (score >= 60) return 7;
	        else if (score >= 50) return 6;
	        else if (score >= 40) return 5;
	        else return 0; // Fail
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int totalGradePoints = 0;
	        int subjects = 3; // Number of subjects

	        for (int i = 1; i <= subjects; i++) {
	            System.out.print("Enter marks for Subject " + i + ": ");
	            int marks = scanner.nextInt();
	            totalGradePoints += convertToGradePoint(marks);
	        }

	        double gpa = (double) totalGradePoints / subjects;
	        System.out.printf("Your GPA is: %.2f\n", gpa);

	        scanner.close();
	    }
	
}
