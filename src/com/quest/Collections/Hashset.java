package com.quest.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

        public static void main(String[] args) {
            //1st obj
            HashSet<Integer> sequentialHashSet = new HashSet<Integer>();
            for (int i = 1; i <= 100; i++) {
                sequentialHashSet.add(i);
            }
            System.out.println("First HashSet (Sequential 1-100):");

            Iterator<Integer> sequentialIterator = sequentialHashSet.iterator();
            while (sequentialIterator.hasNext()) {
                System.out.print(sequentialIterator.next() + " ");
            }
            System.out.println("\n");
//2nd obj
            HashSet<Integer> randomHashSet = new HashSet<>();
            int[] numbers = {23, 20, 34, 14, 50, 26, 78, 38, 95, 10};
            for (int num : numbers) {
                randomHashSet.add(num);
            }
            System.out.println("Second HashSet :");
            Iterator<Integer> random = randomHashSet.iterator();
            while (random.hasNext()) {
                System.out.print(random.next() + " ");
            }
            System.out.println("\n");

//3rd obj
            HashSet<Object> nullHashSet = new HashSet<>();
            nullHashSet.add(1);
            nullHashSet.add(2);
            nullHashSet.add(null);
            nullHashSet.add(null);
            nullHashSet.add(3);

            System.out.println("Third HashSet :");
            Iterator<Object> mixedIterator = nullHashSet.iterator();
            while (mixedIterator.hasNext()) {
                System.out.print(mixedIterator.next() + " ");
            }
            System.out.println();
        }
    }

