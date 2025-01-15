package com.yaksha.assignment;

public class IfElseIfStatementAssignment {

	public static void main(String[] args) {

		// Task 1: Check if a number is positive, negative, or zero
		int number = 0;
		if (number > 0) {
			System.out.println("The number " + number + " is positive.");
		} else if (number < 0) {
			System.out.println("The number " + number + " is negative.");
		} else {
			System.out.println("The number " + number + " is zero.");
		}

		// Task 2: Find the smallest of three numbers
		int a = 10, b = 5, c = 15;
		if (a <= b && a <= c) {
			System.out.println("The smallest number is: " + a);
		} else if (b <= a && b <= c) {
			System.out.println("The smallest number is: " + b);
		} else {
			System.out.println("The smallest number is: " + c);
		}

		// Task 3: Check if a number is divisible by 3, 5, or both
		int num = 15;
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("The number " + num + " is divisible by both 3 and 5.");
		} else if (num % 3 == 0) {
			System.out.println("The number " + num + " is divisible by 3.");
		} else if (num % 5 == 0) {
			System.out.println("The number " + num + " is divisible by 5.");
		} else {
			System.out.println("The number " + num + " is divisible by neither 3 nor 5.");
		}

		// Task 4: Grade calculation based on marks
		int marks = 82;
		if (marks >= 90) {
			System.out.println("Grade: A");
		} else if (marks >= 75) {
			System.out.println("Grade: B");
		} else if (marks >= 50) {
			System.out.println("Grade: C");
		} else {
			System.out.println("Grade: F");
		}

		// Task 5: Check leap year
		int year = 2024;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("The year " + year + " is a leap year.");
		} else {
			System.out.println("The year " + year + " is not a leap year.");
		}
	}
}
