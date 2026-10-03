package Tasks_Third;

public class Employee_Main {

	public static void main(String[]args) {
		
		Employee emp1 = new Employee();
		emp1.display();
		
		System.out.println("*************************");
		
		Employee emp2  = new Employee(101,"Suyash","CSE",50000);
		emp2.display();
		
	}
	
}

//Inheritance is an important feature of Object-Oriented Programming (OOP) in Java. 
//It allows one class (child/subclass) to acquire the properties and methods of another class (parent/superclass).
//Inheritance is achieved using the extends keyword.