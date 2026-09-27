package Task_Second;

import java.util.Scanner;

//Task 1: Conditional Statements — Student Result

public class Task_1 {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Student name :");
	    String name =sc.next();
	    
	    System.err.println(" ***** Enter three subject marks ***** ");
	    System.out.println("Enter the Java marks");
		int java = sc.nextInt();
		System.out.println("Enter the Html marks");
		int html = sc.nextInt();
		System.out.println("Enter the Python marks");
		int python = sc.nextInt();
		
		float total_Marks = java + html + python ;
		
		float percentage = (total_Marks / 300 ) * 100;
		
		System.out.println("Student Name :"+name);
		System.out.println("Total Marks :"+total_Marks);
		System.out.println("Percentage : "+percentage);

		 int passing_percentage  = 40;
		
		if(passing_percentage < percentage){
			System.out.println("Student Result Passed");
		}
		else {
			System.out.println("Student Result Failed");
		}
	}
}
