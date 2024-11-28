package com.quest.Collections;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class HashTreeLinked {
    public static void main(String[] args) {

        // 1. HashSet with 100 sequential elements
        HashSet<Integer> hashSet1 = new HashSet<>();
        for (int i = 1; i <= 100; i++) {
            hashSet1.add(i);
        }
        System.out.println("HashSet with 100 sequential elements:");
        for (Integer element : hashSet1) {
            System.out.print(element + " ");
        }
        System.out.println("\n");

        // 2. HashSet with 10 random numbers
        HashSet<Integer> hashSet2 = new HashSet<>();
        Random rand = new Random();
        while (hashSet2.size() < 10) {
            int randomNumber = rand.nextInt(100);
            hashSet2.add(randomNumber);
        }
        System.out.println("HashSet with 10 random numbers:");
        for (Integer element : hashSet2) {
            System.out.print(element + " ");
        }
        System.out.println("\n");

        // 3. HashSet with 5 values, 2 of them are null
        HashSet<Integer> hashSet3 = new HashSet<>();
        hashSet3.add(null);
        hashSet3.add(1);
        hashSet3.add(2);
        hashSet3.add(null);
        hashSet3.add(3);
        System.out.println("HashSet with 5 values, including nulls:");
        for (Integer element : hashSet3) {
            System.out.print(element + " ");
        }
        System.out.println("\n");

        // 1. TreeSet with 100 sequential elements (Automatically sorted)
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        for (int i = 1; i <= 100; i++) {
            treeSet1.add(i);
        }
        System.out.println("TreeSet with 100 sequential elements:");
        for (Integer element : treeSet1) {
            System.out.print(element + " ");
        }
        System.out.println("\n");

        // 2. TreeSet with 10 random numbers
        TreeSet<Integer> treeSet2 = new TreeSet<>();
        while (treeSet2.size() < 10) {
            int randomNumber = rand.nextInt(100);
            treeSet2.add(randomNumber);
        }
        System.out.println("TreeSet with 10 random numbers:");
        for (Integer element : treeSet2) {
            System.out.print(element + " ");
        }
        System.out.println("\n");

        // 3. TreeSet with 5 values, 2 of them are null
        try {
            TreeSet<Integer> treeSet3 = new TreeSet<>();
            treeSet3.add(2);
            treeSet3.add(1);
            treeSet3.add(null);
            treeSet3.add(null);
            treeSet3.add(3);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
        System.out.println("\n");

        // 1. LinkedHashSet with 100 sequential elements
        LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<>();
        for (int i = 1; i <= 100; i++) {
            linkedHashSet1.add(i);
        }
        System.out.println("LinkedHashSet with 100 sequential elements:");
        for (Integer element : linkedHashSet1) {
            System.out.print(element + " ");
        }
        System.out.println("\n");

        // 2. LinkedHashSet with 10 random numbers
        LinkedHashSet<Integer> linkedHashSet2 = new LinkedHashSet<>();
        while (linkedHashSet2.size() < 10) {
            int randomNumber = rand.nextInt(91);
            linkedHashSet2.add(randomNumber);
        }
        System.out.println("LinkedHashSet with 10 random numbers:");
        for (Integer element : linkedHashSet2) {
            System.out.print(element + " ");
        }
        System.out.println("\n");

        // 3. LinkedHashSet with 5 values, 2 of them are null
        LinkedHashSet<Integer> linkedHashSet3 = new LinkedHashSet<>();
        linkedHashSet3.add(null);
        linkedHashSet3.add(1);
        linkedHashSet3.add(2);
        linkedHashSet3.add(null);
        linkedHashSet3.add(3);
        System.out.println("LinkedHashSet with 5 values, including nulls:");
        for (Integer element : linkedHashSet3) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }
}

