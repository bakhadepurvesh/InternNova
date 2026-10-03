package Tasks_Third;

public class Manager_Task_4 extends Employee_Task_4 {

	public int teamSize;

	 public void display(String name, int emp_Id, double salary ,String profession ,int teamSize) {
		this.name = name;
		this.emp_Id = emp_Id;
		this.salary = salary;
		this.profession = profession;
		this.teamSize = teamSize;
		
	 }
	
	 public void managerWork() {
	     System.out.println("Team Size : " + teamSize);
	 }

}
