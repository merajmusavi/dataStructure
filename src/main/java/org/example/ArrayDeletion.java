package org.example;

import java.util.Arrays;

public class ArrayDeletion {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 10, 12};
        int numberToDelete = 4;

        int[] newArray = deleteFromArray(array, numberToDelete);

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array after deleting " + numberToDelete + ": " + Arrays.toString(newArray));

    }
    public static int[] deleteFromArray(int[] array, int numberToDelete) {
        int indexToDelete = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToDelete) {
                indexToDelete = i;
                break;
            }
        }
        if (indexToDelete == -1) {
            return array;
        }
        int[] newArray = new int[array.length - 1];

        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i != indexToDelete) {
                newArray[newIndex] = array[i];
                newIndex++;
            }


        }
        return newArray;
    }
}