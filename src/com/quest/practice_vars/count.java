package com.quest.practice_vars;

public class count {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 10, 30, 20, 50, 40, 40, 30, 30, 10};
        for (int i = 0; i < numbers.length; i++) {
            int count = 1;
            boolean counted = false;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    counted = true;
                    break;
                }
            }
            if (!counted) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println(numbers[i] + "'s - " + count/2);
                }
            }
        }
    }
}
