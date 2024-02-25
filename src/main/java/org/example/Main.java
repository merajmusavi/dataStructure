package org.example;

public class Main {
    public static void main(String[] args) {
        // Array of numbers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 20, 100, 200, 300, 400, 500, 1002, 1003, 100004};

        // Number to find
        int goal = 1002;

        // Find the number and print the result
        int foundNumber = findNumber(goal, numbers);
        System.out.println("The number " + foundNumber + " was found.");
    }

    // Method to find the number in the array using binary search
    public static int findNumber(int goal, int[] numbers) {
        int low = 0;            // Index of the first element in the array
        int high = numbers.length - 1;  // Index of the last element in the array

        int found = 0;          // Variable to store the found number, initialized to 0

        // Binary search algorithm
        while (high >= low) {
            int middleIndex = (low + high) / 2;  // Calculate the middle index of the array
            if (numbers[middleIndex] == goal) {  // If the middle element is the goal number
                found = numbers[middleIndex];    // Store the found number
                break;                           // Exit the loop
            } else if (numbers[middleIndex] > goal) {  // If the middle element is greater than the goal number
                high = middleIndex - 1;                // Adjust the high index
            } else {                                   // If the middle element is less than the goal number
                low = middleIndex + 1;                 // Adjust the low index
            }
        }

        return found;  // Return the found number
    }
}
