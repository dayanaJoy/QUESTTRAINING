package com.quest.Practice;
public class MissingValue {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8};
        int rangeStart = 1;
        int rangeEnd = 10;
        findMissingElements(arr, rangeStart, rangeEnd);
    }

    public static void findMissingElements(int[] arr, int rangeStart, int rangeEnd) {
        System.out.println("Missing elements:");
        for (int i = rangeStart; i <= rangeEnd; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(i + " ");
            }
        }
    }
}



