package Tasks_Third;

public class Task_6_main {

	public static void main(String[] args) {
		
		Bank_Account_Task_6 ph = new Bank_Account_Task_6();
		
		ph.setAcc_Name("suyash");
		ph.setAcc_Number(1000001);
		ph.setAcc_Balance(1000);
		
		System.out.println("Account Holder Name :"+ph.getAcc_Name());
		System.out.println("Account Number :"+ph.getAcc_Number());
		System.out.println("Balance :"+ph.getAcc_Balance());
	}
	
}

//Encapsulation is the process of wrapping data and methods together in a single class and restricting direct access to the data.
//In Java, encapsulation is commonly achieved using private variables and public getter/setter methods.

//Abstraction means hiding implementation details and showing only the necessary functionality to the user.
//In Java, abstraction can be achieved using abstract classes and interfaces.