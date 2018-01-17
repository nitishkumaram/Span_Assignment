//Program To Take Input From User And Display Its Factorial

package com.span.assignment.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

	public static void main(String args[]){
		
		try{
			System.out.println("Enter the Number to show its Factorial= ");
			Scanner input_no = new Scanner(System.in);
			
			//Declare variable with proper naming convention
			
			int inputFactNum = input_no.nextInt();
			input_no.close();
			
			System.out.println("Factorial of "+inputFactNum+" are :-");
			System.out.println();
			
			System.out.println(findFactorial(inputFactNum));
			
		} catch(InputMismatchException e){
			System.out.println("Enter only numbers");
		}
	}
	
	static int findFactorial(int inputFactNum){
		return (inputFactNum ==1 || inputFactNum==0)?1:(inputFactNum*findFactorial(inputFactNum-1));
	}
}
