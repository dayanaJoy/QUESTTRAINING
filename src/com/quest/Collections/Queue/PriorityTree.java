package com.quest.Collections.Queue;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityTree {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<String> pq2 = new PriorityQueue<>();

        TreeSet<Integer> ts = new TreeSet<>();
        pq.add(10);
        pq.add(6);
        pq.add(90);
        pq.add(54);
        pq.add(21);
        pq.add(21);
        //pq.add(null);
       // pq.add(null);

        pq2.add("Hi");
        pq2.add("Hi");
        //pq2.add(null);
        System.out.println(pq2);
        ts.add(10);
        ts.add(6);
        ts.add(90);
        ts.add(54);
        ts.add(21);
        ts.add(21);
       // ts.add(null);

        System.out.println(pq);
        System.out.println();
        System.out.println(ts);
    }
}