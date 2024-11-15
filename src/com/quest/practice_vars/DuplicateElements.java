package com.quest.practice_vars;

public class DuplicateElements {
    public static void findDuplicates(int[] arr) {
        System.out.println("Duplicate elements: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (arr[i] == arr[k]) {
                        alreadyPrinted = true;
                        break;
                    }
                }
                if (!alreadyPrinted) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 3, 4, 9, 10, 2};
        findDuplicates(arr);
    }
}
