package Tasks_Third;

public class Student_Management {

	public static void main(String[] args) {
		
		// Creating objects of Student class
		Student st1 = new Student("Suyash",101, "CSE",8.69);
		Student st2 = new Student("Ram",103, "IT",9.69);
		Student st3 = new Student("Vinay",105, "ECE",7.69);
		
		
		 // Displaying student information
        System.out.println("===== Student Information =====");
        
        System.out.println("\nStudent 1");
		System.out.println("Name :"+st1.stdName);
		System.out.println("Roll Number :"+st1.rollNum);
		System.out.println("Branch : " + st1.stdBranch);
        System.out.println("CGPA : " + st1.stdCGPA);
        
        System.out.println("\nStudent 2");
		System.out.println("Name :"+st2.stdName);
		System.out.println("Roll Number :"+st2.rollNum);
		System.out.println("Branch : " + st2.stdBranch);
        System.out.println("CGPA : " + st2.stdCGPA);
        
        System.out.println("\nStudent 3");
		System.out.println("Name :"+st3.stdName);
		System.out.println("Roll Number :"+st3.rollNum);
		System.out.println("Branch : " + st3.stdBranch);
        System.out.println("CGPA : " + st3.stdCGPA);

	}
	
}
