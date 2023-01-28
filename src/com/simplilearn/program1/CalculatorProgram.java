package com.simplilearn.program1;

import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the first and the second number- ");
		double number1= input.nextDouble();
		double number2= input.nextDouble();
		System.out.println("choose and enter the type of operation you want to perform on number (+,-,/,*,%) - ");
		char operator= input.next().charAt(0);
		operation(number1, number2, operator);
		}
		public static Long operation(double number1, double number2, char operator)
		{
		Long result=(long) 0;
		if(operator=='+')
		{
		result= (long) (number1 + number2);
		}
		else if(operator=='-')
		{
		result= (long) (number1 - number2);
		}
		else if(operator=='*')
		{
		result= (long) (number1*number2);
		}
		else if(operator=='/')
		{
		result= (long) (number1/number2);
		}
		else if(operator=='%')
		{
		result= (long) (number1%number2);
		}
		System.out.println("Your answer after performing operation is = " + result);
		return result; 
		}
		
}
		
		
