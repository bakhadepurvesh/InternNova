package Tasks_Third;

public class Bank_Main {

	public static void main(String[]args){
	
		Bank_Account acc1 = new Bank_Account("Suyash", 123456789, 100.5);
		acc1.display();
		System.out.println("**********");
		Bank_Account acc2 = new Bank_Account("Ram", 987654321, 50.7);
		acc2.display();
		System.out.println("**********");
		Bank_Account acc3 = new Bank_Account("Sita", 786798564, 40);
		acc3.display();
		
		System.out.println("**********");
        System.out.println("Total Number of Accounts : " + Bank_Account.totalAccounts);
    
	}
	
}
