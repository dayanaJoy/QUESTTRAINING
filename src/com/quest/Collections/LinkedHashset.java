package com.quest.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashset {
        public static void main(String[] args) {
            //1st obj
            LinkedHashSet<Integer> sequential = new LinkedHashSet<Integer>();
            for (int i = 1; i <= 100; i++) {
                sequential.add(i);
            }
            System.out.println("First LinkedHashSet (Sequential 1-100):");
            Iterator<Integer> sequentialIterator = sequential.iterator();
            while (sequentialIterator.hasNext()) {
                System.out.print(sequentialIterator.next() + " ");
            }
            System.out.println("\n");
// 2nd obj
            LinkedHashSet<Integer> random = new LinkedHashSet<>();
            int[] numbers = {23, 20, 34, 14, 50, 26, 78, 38, 95, 10};
            for (int num : numbers) {
                random.add(num);
            }
            System.out.println("Second  LinkedHashSet :");
            Iterator<Integer> randomIterator = random.iterator();
            while (randomIterator.hasNext()) {
                System.out.print(randomIterator.next() + " ");
            }
            System.out.println("\n");
            //3rd obj
            LinkedHashSet<Integer> nullLinked = new LinkedHashSet<Integer>();

            nullLinked.add(1);
            nullLinked.add(2);
            nullLinked.add(null);
            nullLinked.add(null);
            nullLinked.add(3);
            System.out.println("Third LinkedHashSet :");
            Iterator<Integer> nullIterator = nullLinked.iterator();
            while (nullIterator.hasNext()) {
                System.out.print(nullIterator.next() + " ");
            }
            System.out.println();





        }
    }

