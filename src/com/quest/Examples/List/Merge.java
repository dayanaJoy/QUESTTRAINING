package com.quest.Examples.List;

import java.util.*;

public class Merge {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("Apple","Orange","Mango"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Grapes","Apple"));
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        list1.addAll(list2);
        System.out.println("Merge list ( with duplicates) : " + list1);
        for (String item : list1) {
            if (!list2.contains(item)) {
                list2.add(item);
            }
        }
        System.out.println("List without duplicates : " + list2);
    }
}



































/* Set<String> set1 = new HashSet<>(list1);
        System.out.println("List without duplicates : " + set1);*/