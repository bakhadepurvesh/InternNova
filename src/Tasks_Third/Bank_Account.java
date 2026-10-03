package Tasks_Third;

//Task 3: "this" & "static" — Bank Account 
//Create a "BankAccount" class containing:
//- Account Holder Name
//- Account Number
//- Balance
//Use the "this" keyword to differentiate instance variables from constructor parameters.
//Also create a "static" variable to keep track of the total number of bank accounts created.
//Create at least 3 objects and display:
//- Account details
//- Total number of accounts

public class Bank_Account {
	
	public String accholder_Nam ;
	public long account_Number ;
	public double acc_Balance;
	
	public static int totalAccounts = 0 ;
	
	public Bank_Account(String accholder_Nam ,long account_Number,
			            double acc_Balance) {
		
		 this.accholder_Nam = accholder_Nam;
		 this.account_Number = account_Number;
		 this.acc_Balance = acc_Balance;
		
		 totalAccounts ++ ;
	}
	
	public void display() {
		System.out.println("Account Holder Name :"+ accholder_Nam);
		System.out.println("Account Number :"+ account_Number);
		System.out.println("Account Balance :"+ acc_Balance);
	}
	
}

//this is a keyword in Java that refers to the current object.
//It is commonly used when instance variable names and constructor/method parameter names are the same.

//static is a keyword used for members that belong to the class rather than individual objects.
//A static variable has only one shared copy for the entire class.