package com.quest.Questions;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        System.out.println("Before Swapping");
        System.out.println("arr 1 :");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print( arr1[i] + " ");
        }
        System.out.println("\narr 2 :");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print( arr2[i] + " ");
        }
        int[] temp = arr1;
        arr1 = arr2;
        arr2 = temp;
        System.out.println("\nAfter Swapping");
        System.out.println("arr 1 :");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print( arr1[i] + " ");
        }
        System.out.println("\narr 2 :");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print( arr2[i] + " ");
        }
    }
}
