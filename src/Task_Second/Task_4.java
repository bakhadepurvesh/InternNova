package Task_Second;
//  4: Method Parameters & Return Types 

import java.util.Scanner;

public class Task_4 {

	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Num :");
		int num = sc.nextInt();
		Task_4 ts = new Task_4();
		System.out.println("Square of a Number : "+ts.squareTwoNum(num));
		System.out.println("Cube of a Number : "+ts.cubeTwoNum(num));
		
		System.out.println(" Enter of three numbers :");
		int num_1 = sc.nextInt();
		int num_2 = sc.nextInt();
		int num_3 = sc.nextInt();
		
	  System.out.println("Average of three numbers is :"+ts.averageThreeNum(num_1, num_2, num_3));
	
		System.out.println("Enter of two numbers :");
		int num_one = sc.nextInt(); 
		int num_two = sc.nextInt();
		
		System.out.println("Maximum of two numbers :"+ ts.maxNumber(num_one, num_two));
		
	}
	 
	public int squareTwoNum(int a){
		return a * a ;
	}
	
	public int cubeTwoNum(int a){
		return a * a * a;
	}
	
	public int averageThreeNum(int a,int b,int c) {
		int totalnum = 3;
		return(a + b + c) / totalnum;
	}
	
	public int maxNumber(int a , int b) {
		if(a > b){
			return a;
		}else {
			return b;
		}
	}
}
