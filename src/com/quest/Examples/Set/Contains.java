package com.quest.Examples.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Contains {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4));
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        if (set1.containsAll(set2)) {
            System.out.println("Set 1 contains all elements of Set 2.");
        } else {
            System.out.println("Set 1 does not contain all elements of Set 2.");
        }
        if (set2.containsAll(set1)) {
            System.out.println("Set 2 contains all elements of Set 1.");
        } else {
            System.out.println("Set 2 does not contain all elements of Set 1.");
        }
    }
}

