package Task_Second;

import java.util.Scanner;

// Task 6: 2D Array — Matrix Operations

public class Two_D_Array {

    public static void main(String[]args){

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Create a 3 x 3 2D array
        int [][] arr = new int[3][3];

        // Take input for matrix elements
        for(int i=0;i<3;i++){

            // Loop through columns
            for(int j=0;j<3;j++) {

                // Ask user to enter each element
                System.out.print("Enter element [" + i + "][" + j + "]: ");

                // Store the entered value in the array
                arr[i][j] = sc.nextInt();
            }
        }

        // Display the array
        System.out.println("Array :");

        // Variable to store the sum of all elements
        int sum = 0;

        // Loop through rows
        for(int i=0;i<3;i++) {

            // Loop through columns
            for(int j=0;j<3;j++) {

                // Display each array element
                System.out.println(arr[i][j]+" ");

                // Add each element to sum
                sum += arr[i][j];
            }

            // Move to the next row
            System.out.println();
        }

        // Display the total sum
        System.out.println("Sum of all elements: " + sum);

        // Close Scanner
        sc.close();
    }
}
