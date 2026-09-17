package Task_First;

import java.util.Scanner;
//Task 3: Input & Output using Scanner Class
//Create a Java program that accepts the following details from the user:
//Full Name ,Age ,College Name ,Branch ,City

public class Scanner_Task {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Name :");
		String name = sc.next();
		
		System.out.print("Enter the Age :");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter the College Name :");
		String college_Name = sc.nextLine();
		
		System.out.print("Enter the Branch :");
	    String myBranch	= sc.next();
	    
	    System.out.print("Enter the City :");
	    String myCity = sc.next();
	    
	    System.err.println("Your Data Entered Sucessfully Thank for Visit");
	    
	}
	

}
