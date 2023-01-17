//Write a program to get a number from the user and print whether it is positive or negative
package com.practice;
import java.util.Scanner;


/**
 * @author shamb
 *
 */
public class Assign_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("Enter the number to check whether it is positive or negative: ");
		int num = scanner.nextInt();
		
		if(num == 0) {
			System.out.println("Number entered is zero");
		}
		else if (num > 0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is negative");
		}
		}	
	}
		
}
