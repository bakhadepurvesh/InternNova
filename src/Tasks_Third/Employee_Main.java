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
