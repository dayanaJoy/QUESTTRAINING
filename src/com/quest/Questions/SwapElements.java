package com.quest.Questions;

import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int index1 = 1;
        int index2 = 3;
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println();

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        System.out.println("Array after swapping elements at index " + index1  + " and " + index2 + " : " + Arrays.toString(arr));
    }
}

