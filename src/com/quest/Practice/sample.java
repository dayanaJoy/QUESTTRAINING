package com.quest.Practice;

import java.util.Arrays;

public class sample {
    public static void main(String[] args) {
        int[] array = {17, 14, 21, 35, 31, 52, 42, 27, 29};
        Arrays.sort(array);
//        for (int j = 0; j < array.length; j++) {
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i] > array[i + 1]) {
//                    int temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                }
//            }
//        }
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
