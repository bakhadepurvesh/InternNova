package Task_Second;

import java.util.Scanner;

// 1D Array — Student Marks

public class One_D_Array {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for number of students
        System.out.println("Enter the Number in array :");
        int n = sc.nextInt();

        // Create an array to store student marks
        int[] std = new int[n];

        // Take marks from the user
        for (int i = 0; i < std.length; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            std[i] = sc.nextInt();
        }

        System.out.println("Student Marks : ");

        // Variables for total, average, highest and lowest marks
        int sum = 0;
        int avg = 0;

        // Take first mark as highest and lowest initially
        int highest = std[0];
        int lowest = std[0];

        // Loop through the array
        for (int i = 0; i < std.length; i++) {

            // Display each student's marks
            System.out.println(std[i]);

            // Add marks to total
            sum += std[i];

            // Calculate average
            avg = sum / std.length;

            // Check for highest marks
            if (std[i] > highest) {
                highest = std[i];
            }

            // Check for lowest marks
            if (std[i] < lowest) {
                lowest = std[i];
            }
        }

        // Display the results
        System.out.println("Total Marks : " + sum);
        System.out.println("Average marks : " + avg);
        System.out.println("Highest marks : " + highest);
        System.out.println("Lowest marks : " + lowest);

        // Close Scanner
        sc.close();
    }
}
