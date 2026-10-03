package Tasks_Third;

//Abstraction
//Create an abstract class named "Account" containing:
//- At least one abstract method
//- At least one normal method
//Create a child class that extends the abstract class and implements the abstract method.
//Display the account details and demonstrate the implemented functionality.

public abstract class Second_Task_6 {
	
	    // Abstract method
	    public abstract void accountType();

	    // Normal method
	    public void accountDetails() {
	        System.out.println("Account Holder: Rahul");
	        System.out.println("Account Number: 123456789");
	        System.out.println("Balance: 50000");
	    }
	}

