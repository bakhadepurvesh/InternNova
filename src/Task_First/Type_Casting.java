package Task_First;

//Task 5: Type Casting 
//Implicit Type Casting , Explicit Type Casting
//Also write a short explanation (4–5 lines)difference between implicit and explicit type casting.

public class Type_Casting {

	public static void main(String[]args) {
		
//		Implicit Type Casting
		
		int num1 = 10;
		double num2 = num1;
//		System.out.println(num2);
		
		int num3 = 20;
		long num4 = num3;
//		System.out.println(num4);
		
		int num5 = 5;
		float num6 = num5;
//		System.out.println(num6);
		
		char  ch = 'A';
		int integer = ch;
//		System.out.println(integer);
		
		int a = 10;
		float b = 20.5f;
		
		double dc = a + b ; // 10 + 20.5 = 30.5
		
//		System.out.println(dc);
		
		
//		Explicit Type Casting
		
		double num = 10.50;
		int numInt = (int) num;
//		System.out.println(numInt);
		
		float price = 99.99f;
		int rate = (int)price;
//		System.out.println(rate);
		
		long numLong = 1234567892l;
		int numConversion = (int)numLong;
//		System.out.println(numConversion);
		
		
		double ab = 20.8;
		double bc = 5.5;
				
		int result = (int)(ab + bc); // 20.8 + 5 .5 = 26
//		System.out.println(result);
				
//		int vc = 130;
//		byte chh = (byte) vc;
//		System.out.println(chh);
		
	}
	
}

/// implicit type casting means small datatype convert into big datatype is called as implicit type casting.(java automatically do )
/// Explicit type casting means big datatype convert into small datatype is called as Explicit type casting.(developer loss the data) 

//byte
//↓
//short
//↓
//int
//↓
//long
//↓
//float
//↓
//double