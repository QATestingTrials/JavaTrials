package Homework;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("What would you like to do?\nType 1 for Addition:\nType 2 for Substraction:\nType 3 for Multiplication:\nType 4 for division: \n\n");	
		Scanner selection=new Scanner(System.in);
		int num =selection.nextInt();
		        
		if (num>0 && num <=4) {
			System.out.println("Enter first number :");
			double num1 =selection.nextDouble();
			System.out.println("Enter second number :");
			double num2 =selection.nextDouble();
				
			
			switch(num) {
			case 1: 
				System.out.println("Addition of the two numbers entered is :\n"+(num1+num2));
				break;
			case 2: 
				System.out.println("Substraction of two numbers entered is :\n"+(num1-num2));
				break;
			case 3: 
				System.out.println("Multiplication of two numbers entered is :\n"+(num1*num2));
				break;
			case 4: 
				System.out.println("Division of two numbers entered is :\n"+(num1/num2));
				break;
			default:
				System.out.println("Invalid numbers");
				
			}
		}
		else {System.out.println("Select number between 1 and 4 for your desired operation");
		}
	
	
	}
	

}
