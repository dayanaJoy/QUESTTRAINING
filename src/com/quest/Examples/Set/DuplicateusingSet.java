package com.quest.Examples.Set;

import java.util.HashSet;
import java.util.Set;

public class DuplicateusingSet {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 2, 6, 7, 7};
        boolean isDuplicate = false;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                isDuplicate = true;
                System.out.println("Duplicate found : \n"+num);
            }else {
                set.add(num);
            }
        }
        if(!isDuplicate) {
            System.out.println("No Duplicates in Set");
        }
    }
}
