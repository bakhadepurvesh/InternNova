package Tasks_Third;

//Task 5: Polymorphism — Method Overloading & Overriding 
//Create a Java program demonstrating both types of polymorphism.
//Part A: Method Overloading
//Create a class with multiple methods having the same name but different parameters.

//"calculate(int, int)","calculate(double, double)","calculate(int, int, int)"

public class Polymorphism {

	
	public void calculate(int a , int b) {
	  System.out.println(a+b);
	}
	
	public void calculate(double d , double e) {
		System.out.println(d+e);
	}
	
	public void calculate(int f, int g, int h) {
		 System.out.println(f+g+h);
	}
	
}

//Method overloading means having multiple methods with the same name but different parameters in the same class.
//Method overriding occurs when a child class provides its own implementation of a method that is already defined in the parent class.