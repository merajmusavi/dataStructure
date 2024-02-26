package org.example;

import java.util.Arrays;

public class RemoveDuplicatesUnsorted {
    public static void main(String[] args) {
        int[] ints = {3, 4, 6, 6, 7, 7, 7, 7, 7, 7};
        int[] ints1 = removeDuplicated(ints);
        for (int i : ints1) {
            System.out.println(i);
        }
    }

    public static int[] removeDuplicated(int[] array) {

        int uniqueIndex = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueIndex; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                array[uniqueIndex++] = array[i];
            }
        }
        return Arrays.copyOf(array,uniqueIndex);
    }
}
