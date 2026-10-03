package Tasks_Third;

//Task 2: Constructors — Employee Information 
//Create an "Employee" class with:
//- Employee ID , Employee Name ,Department ,Salary 
//Implement: - A default constructor , A parameterized constructor


public class Employee {
		
		public int employee_Id; 
		public String employee_Name ;
		public String employee_dept;
		public double employee_Salary;
		
	 
		public Employee() {
			 this.employee_Id  = 102 ;
			 this.employee_Name = "Suresh";
			 this.employee_dept = "CSE";
			 this.employee_Salary = 90000;
		}
		
	 
	 public Employee(int employee_Id,String employee_Name,
			        String employee_dept,double employee_Salary) {
		 this.employee_Id  = employee_Id ;
		 this.employee_Name = employee_Name;
		 this.employee_dept = employee_dept;
		 this.employee_Salary = employee_Salary;
	 }
	 
	 
	 public void display() {
		 System.out.println("Employee Id :"+employee_Id);
		 System.out.println("Employee Name :"+employee_Name);
		 System.out.println("Employee Department :"+employee_dept);
		 System.out.println("Employee Salary :"+employee_Salary);
	 }
}


//A constructor in Java is a special method that is
//automatically called when an object is created. 
//It is mainly used to initialize the object's data members.
