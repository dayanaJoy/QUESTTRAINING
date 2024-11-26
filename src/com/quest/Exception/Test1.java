package com.quest.Exception;

public class Test1 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7,9};
        System.out.println("Arayy elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] != i ) {
                System.out.println("\nMissing element : " + i);
                break;
            }
        }
    }
}
