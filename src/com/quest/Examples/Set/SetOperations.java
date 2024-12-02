package com.quest.Examples.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3,4,5,6));
        System.out.println("Set 1 : " + set1);
        System.out.println("Set 2 : " + set2);
        //union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union : " + union );
        //intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection : " + intersection );
        //Difference
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference(set1 - set2) : " + difference );
        Set<Integer> difference2 = new HashSet<>(set2);
        difference2.retainAll(set1);
        System.out.println("Difference(set2 - set1) : " + difference2 );
    }
}
