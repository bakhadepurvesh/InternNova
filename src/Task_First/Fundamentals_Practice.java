package Task_First;

import java.util.Scanner;

//Java Fundamentals Practice 
//Accepts an integer, float, and double value from the user.
//Perform both implicit and explicit type casting wherever applicable.
//Print the values before and after type casting.

public class Fundamentals_Practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Implicit Type Casting
		
//		System.out.print("enter num1 in integer :");
		int num1 = sc.nextInt();
		double num2 = num1;
//		System.out.println("output will be in double :"+num2);
		
//		System.out.print("enter num3 in integer :");
		int num3 = sc.nextInt();
		long num4 = num3;
//		System.out.println("output will be in long :"+num4);
		
//		System.out.print("enter num5 in integer :");
		int num5 = sc.nextInt();
		float num6 = num5;
//		System.out.println("output will be in float :"+num6);
		
//		System.out.print("enter ch in char :");
		char ch = sc.next().charAt(0);
		int integer = ch;
//		System.out.println("output will be in integer :"+integer);
		
//		System.out.print("enter a,b in integer + float :");
		int a = sc.nextInt();
		float b = sc.nextFloat();
		double dc = a + b;
//		System.out.println("output will be in double :"+ dc);

		
//		Explicit Type Casting
		
		System.out.print("enter num in double :");
		double num = sc.nextDouble();
		int numInt = (int) num;
		System.out.println("output will be in int :"+numInt);
		
		System.out.print("enter num in float :");
		float price = sc.nextFloat();
		int rate = (int)price;
		System.out.println("output will be in int :"+rate);
		
	}
	
}
//Explicit type casting is the manual conversion of one data type into another data type by the programmer using the casting operator (datatype).
//Implicit type casting is the automatic conversion of a smaller data type into a larger data type by the
