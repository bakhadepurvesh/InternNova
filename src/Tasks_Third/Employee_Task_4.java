package Tasks_Third;

//Task 4: Inheritance — Employee Management
//Create a parent class named "Employee".
//Add common properties such as:
//- Name
//- Employee ID
//- Salary
//Create two child classes:
//- "Developer"
//- "Manager"
//Add at least one additional property or method specific to each child class.
//Create objects of both child classes and display their details.
//Requirements:
//- Demonstrate "extends".
//- Demonstrate code reusability through inheritance.
//- Use parent and child class methods/properties.

public class Employee_Task_4 {

	public String name;
	public int emp_Id;
	public double salary;
	public String profession ;
	
	
	public void show() {
		System.out.println("Name :"+name);
		System.out.println("Emplyee_ID :"+emp_Id);
		System.out.println("Salary :"+salary);
		System.out.println("Profession :"+profession);
	}
	

}
