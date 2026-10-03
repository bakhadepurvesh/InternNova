package Tasks_Third;

public class PolymorphismMain {

	public static void main(String[] args) {
		
		Polymorphism ploy = new Polymorphism();
//		ploy.calculate(10, 20);
//		ploy.calculate(20, 20);
//		ploy.calculate(10, 20, 30);
		
		
//		Ploy_Vehicle ph = new Ploy_Vehicle();
//		ph.start(); 
		
		Poly_Car ph1  = new Poly_Car();
		ph1.start();
		
		Poly_Bike ph2 = new Poly_Bike();
		ph2.start();
		
	}
	
}
