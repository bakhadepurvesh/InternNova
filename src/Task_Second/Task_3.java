package Task_Second;
import java.util.Scanner;
//Methods — Calculator
public class Task_3 {
	
	    public static void main(String[]args) {
		
			Scanner sc = new Scanner(System.in);
			
			 System.out.println("Enter the num1 & num2 :");
			 int num1  = sc.nextInt();
			 int num2 = sc.nextInt();
			 
			 Task_3 ts = new Task_3();
			 ts.addition(num1, num2);
			 ts.subtraction(num1, num2); 
			 ts.multiplication(num1, num2); 
			 ts.division(num1, num2); 
			 ts.modulus(num1, num2); 	 
	    }
	
	    public void addition(int a , int b){
		    int add = a+b;
		    System.out.println("Addition :"+add);
	    }
	    
	    public void subtraction(int a , int b){
	    	int sub = a-b;
		    System.out.println("Subtraction :"+sub);
	    }
	    
	    public void multiplication(int a , int b) {
	    	int mul = a*b;
	    	System.out.println("Multiplication :"+mul);
	    }
	    
	    public void division(int a , int b){
	    	int div = a/b;
	    	System.out.println("Division :"+div);
	    }
	    
	    public void modulus(int a , int b){
	    	int mod= a%b;
	    	System.out.println("Modulus :"+mod);
	    }

}
