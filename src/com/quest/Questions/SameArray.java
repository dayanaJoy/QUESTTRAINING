package com.quest.Questions;

import java.util.Arrays;

public class SameArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,3,2,4};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)) {
            System.out.println("Arrays are the same");
        }else {
            System.out.println("Arrays are not the same");
        }
    }
}
