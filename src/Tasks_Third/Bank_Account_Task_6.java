package Tasks_Third;

//Task 6: Encapsulation & Abstraction — Banking System 
//Create a simple banking system demonstrating encapsulation and abstraction.
//Encapsulation
//Create a "BankAccount" class with private variables:
//- Account Number
//- Account Holder Name
//- Balance
//Use appropriate getter and setter methods to access and modify the data.


public class Bank_Account_Task_6 {

	private long acc_Number;
	private String acc_Name;
	private double acc_Balance;
	
	
	public double getAcc_Balance() {
		return acc_Balance;
	}
	public void setAcc_Balance(double acc_Balance) {
		this.acc_Balance = acc_Balance;
	}
	
	public String getAcc_Name() {
		return acc_Name;
	}
	public void setAcc_Name(String acc_Name) {
		this.acc_Name = acc_Name;
	}
	
	public long getAcc_Number() {
		return acc_Number;
	}
	
	public void setAcc_Number(long acc_Number) {
		this.acc_Number = acc_Number;
	}
}