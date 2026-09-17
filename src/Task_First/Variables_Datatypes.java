package Task_First;

//Task 2: Variables & Data Types
//Create a Java program that stores and displays the following information using appropriate data types:
//Name , Age ,Height ,Weight ,CGPA ,Gender ,Is Student (Boolean)

public class Variables_Datatypes {
	
	public static void main(String[]args){
		
		String name = "Purvesh";
		int age  = 21;
		double height = 167.64;
		float weight = 50f;
		float myCGPA = 6.65f;
		char  gender = 'M';
		boolean is_Student = true;
		
		System.out.println("Name :" +name);
		System.out.println("Age  :"+age);
		System.out.println("Height :"+height);
		System.out.println("Weight :"+weight);
		System.out.println("CGPA :"+myCGPA);
		System.out.println("Gender :"+gender);
		System.out.println("Student :"+is_Student);

	}

}
