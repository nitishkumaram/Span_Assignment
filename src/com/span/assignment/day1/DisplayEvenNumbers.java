//Take Input From User and Display All Even Numbers Till That Input Number using Scanner

package com.span.assignment.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DisplayEvenNumbers {

	public static void main(String args[]){
		try{
			System.out.println("Enter the Number To show all even nos. till that Number :-");
			Scanner input_num= new Scanner(System.in);
			
			//Declare variable with proper naming convention 
			
			int input_limit= input_num.nextInt();
			input_num.close();
			
			System.out.println(" Even nos. till "+input_limit+" are ;- \n");
			
			//Display loop for Even Numbers
			
			for(int evenLimit=0;evenLimit<=input_limit;evenLimit++)
				if(isPrime(evenLimit))
					System.out.print(" "+evenLimit);
		}
		
		catch(InputMismatchException e){
			System.out.println("Enter nunbers only");
		}
	}
	
	static boolean isPrime(int checkNum){
		
		return (checkNum%2 == 0);		//Check Whether number is Even if is even returns true or false
	}
	
}
