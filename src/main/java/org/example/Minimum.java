package org.example;

public class Minimum {
    public static void main(String[] args) {
        // Array of integers
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 13, -300, 8, 9, 10, -1, -100};

        // Print the minimum value in the array
        System.out.println(findMinimum(arr));
    }

    // Method to find the minimum value in an array
    public static int findMinimum(int[] array) {
        // Initialize the minimum value as the first element of the array
        int min = array[0];

        // Loop through the array to find the minimum value
        for (int i = 0; i < array.length; i++) {
            // If the current element is less than the current minimum, update the minimum value
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Return the minimum value found in the array
        return min;
    }
}
