package Tasks_Third;

public class Developer_Task_4 extends Employee_Task_4 {

	 public String programmingLanguage;
	
	public void display(String name, int emp_Id, double salary,String profession,String programmingLanguage) {
		this.name = name;
		this.emp_Id = emp_Id;
		this.salary = salary;
		this.profession = profession;
		this.programmingLanguage = programmingLanguage;
	}

	public void coding() {
        System.out.println("Programming Language : " + programmingLanguage);
    }
}
