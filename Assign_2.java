package com.practice;

//Write a program to find the sum of 5 integers.
import java.util.Scanner;
public class Assign_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter five numbers to add: ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		int n4 = scanner.nextInt();
		int n5 = scanner.nextInt();
		
		int sum = (n1+n2+n3+n4+n5);
		
		System.out.println("Sum = "+sum);
		
	}
}
