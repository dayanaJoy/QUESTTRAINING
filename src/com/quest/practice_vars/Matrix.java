package com.quest.practice_vars;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int value =1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = value++;
            }
        }
        Matrix matrix = new Matrix();
        matrix.display(arr);

        int[] array = {12, 90, 7, 10, 15, 23};;
        matrix.printarray(array);
        int target;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target number");
        target = sc.nextInt();
        int index = matrix.search(array,target);
        if (index != -1)
            System.out.println("The target number is found at index "+index);
        else
            System.out.println("The target number is not found");
        matrix.sortarray(array);
        //matrix.printarray(array);
    }
    public void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int search(int[] array, int target) {
        int index = 0;
        int i;
        for (i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    return i;
                }
                return -1;
            }
            return 0;
    }
    //sorting
    public int sortarray(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorted array");
        printarray(array);
        return 0;
    }
    public int printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }return 0;
    }
}
