package Tasks_Third;

public class Task4_Main {

	public static void main(String[] args) {
		
		Manager_Task_4 man = new Manager_Task_4();
		man.display("Suyash",101,20000, "Manager",10);
		man.show();
		man.managerWork();
		
		System.err.println("*****************");
		
		Developer_Task_4 dev = new Developer_Task_4 ();
		dev.display("Purvesh",102,30000,"Developer","Java");
		dev.show();
		dev.coding();
	}
}
