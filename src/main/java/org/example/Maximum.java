package org.example;

public class Maximum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 3, 3, 3, 54, 343, 33334, 1, 35, 123, 324, 123, 33333};
        System.out.println(findMaximum(numbers));
    }

    public static int findMaximum(int[] array) {
        int max = array[0]; // Initialize the maximum value as the first element of the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update the maximum value if a larger element is found
            }
        }
        return max; // Return the maximum value found in the array
    }
}
