package com.quest.Collections;
import java.util.Iterator;
import java.util.TreeSet;
public class Treeset {
    public static void main(String[] args) {
            //1st obj
            TreeSet<Integer> sequentialTreeSet = new TreeSet<>();
            for (int i = 1; i <= 100; i++) {
                sequentialTreeSet.add(i);
            }
            System.out.println("First TreeSet (Sequential 1-100):");
            Iterator<Integer> sequentialIterator = sequentialTreeSet.iterator();
            while (sequentialIterator.hasNext()) {
                System.out.print(sequentialIterator.next() + " ");
            }
            System.out.println("\n");
//2nd obj
            TreeSet<Integer> randomTreeSet = new TreeSet<>();
            int[] numbers = {23, 20, 34, 14, 50, 26, 78, 38, 95, 10};
            for (int num : numbers) {
                randomTreeSet.add(num);
            }
            System.out.println("Second TreeSet :");
            Iterator<Integer> fixedIterator = randomTreeSet.iterator();
            while (fixedIterator.hasNext()) {
                System.out.print(fixedIterator.next() + " ");
            }
            System.out.println("\n");

            //3rd obj
            TreeSet<Integer> nullTreeSet = new TreeSet<>();
            nullTreeSet.add(1);
            nullTreeSet.add(2);
            nullTreeSet.add(null);
            nullTreeSet.add(null);
            nullTreeSet.add(5);

            System.out.println("Third TreeSet :");
            Iterator<Integer> nullIterator = nullTreeSet.iterator();
            while (nullIterator.hasNext()) {
                System.out.print(nullIterator.next() + " ");
            }
            System.out.println();
        }
    }

