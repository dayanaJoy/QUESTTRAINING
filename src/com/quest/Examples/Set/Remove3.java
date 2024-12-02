package com.quest.Examples.Set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Remove3 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(Arrays.asList(3,2,9,6,12,36,5,78,1,2));
        System.out.println("Set : " + set);
        set.removeIf(x->x%3==0);
        System.out.println("Set( After removing multiples of 3 ) : " + set);
    }
}
