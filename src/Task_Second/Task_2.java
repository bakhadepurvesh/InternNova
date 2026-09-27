package Task_Second;
//Loops — Number Practice
public class Task_2 {

	public static void main(String[] args) {
		
		//Print numbers from 1 to 100.
		
//		for(int i=0;i<=100;i++){
//			System.out.println(i);
//		}

		//Print all even numbers between 1 and 100
		
//		for(int i=0;i<=100;i++){
//		
//			if(i%2==0){
//				System.out.println(i);
//		}		
//	}
		
		//Print all odd numbers between 1 and 100.
		
//		 for(int i=0;i<=100;i++){
//			  
//			 if(i%2==1){
//				 System.out.println(i);
//			 }			 
//		 }

		
		//Calculate the sum of numbers from 1 to 100.
		
//		 int sum =0;		
//		for(int i=0 ; i<=100;i++){		  
//			 sum = sum + i;
//		}		
//		System.out.println(sum);
   
		//Calculate the sum of numbers from 1 to 100. with while loop
		
//		int i=1;
//		int sumo =0;
//		while(i<=100){
//			System.out.println(i);
//			sumo += i;
//			i++;
//		}
//		System.out.println("Total sum :"+sumo);
		
//		//Calculate the sum of numbers from 1 to 100. with do_while loop
		
		int a = 1;
		int sumn = 0;
		
		do {
			sumn+=a;
			a++;
		}while(a<=100);
		
		 System.out.println(sumn);
//		
	}
	
}
