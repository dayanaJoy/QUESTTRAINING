package com.quest.Questions;

public class SecondLargestArray {
    public static void main(String[] args) {
        int[] arr = {11,23,67,89,40};
        System.out.println("Array : ");
        for(int i : arr)
            System.out.print(i + " ");
        int Largest = 0;
        int SecondLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Largest) {
                SecondLargest = Largest;
                Largest = arr[i];
            }
        }
        System.out.println("\nSecond Largest: " + SecondLargest);
    }
}
