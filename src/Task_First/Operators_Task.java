package Task_First;

import java.util.Scanner;

//Task 4: Operators Practice 
//Create a calculator program that performs the following operations 
//using two numbers entered by the user:
//Addition ,Subtraction ,Multiplication ,Division ,Modulus

public class Operators_Task {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter the First Num");
		float num1 = sc.nextInt();
		
		System.out.println("Enter the First Num");
		float num2 = sc.nextInt();
		
		float addition = num1 + num2 ;
		float subtraction = num1 - num2 ;
		float multiplication = num1 * num2 ;
		float division = num1 / num2 ;
		float modulus = num1%num2;
		
		System.out.println("Addition : "+addition);
		System.out.println("Subtraction : "+subtraction);
		System.out.println("Multiplication : "+multiplication);
		System.out.println("Division : "+division);
		System.out.println("Modulus : "+modulus);

	}
	
}
