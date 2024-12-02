package com.quest.Collections.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExp {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(6);
        pq.add(90);
        pq.add(54);
        pq.add(21);
        System.out.println("Integer Queue :\n" + pq);
        System.out.println("Peek : "+pq.peek());//6
        System.out.println("Poll : "+pq.poll());//6 (remove)
        System.out.println(pq);
        //pq.forEach(System.out::println);
        //Double
        PriorityQueue<Double> pq2 = new PriorityQueue<>();
        pq2.add(10.5);
        pq2.add(6.6);
        pq2.add(90.9);
        pq2.add(54.8);
        pq2.add(21.2);
        System.out.println("\nDouble Queue :\n" + pq2);
        System.out.println("Peek : "+pq2.peek());
        System.out.println("Poll : "+pq2.poll());
        System.out.println(pq2);
        //Character
        PriorityQueue<Character> pq3 = new PriorityQueue<>();
        pq3.add('C');
        pq3.add('B');
        pq3.add('E');
        pq3.add('D');
        pq3.add('A');
        System.out.println("\nCharacter Queue :\n" + pq3);
        System.out.println("Peek : "+pq3.peek());
        System.out.println("Poll : "+pq3.poll());
        System.out.println(pq3);
        //String
        PriorityQueue<String> pq4 = new PriorityQueue<>();
        pq4.add("Cherry");
        pq4.add("Banana");
        pq4.add("Pineapple");
        pq4.add("Mango");
        pq4.add("Apple");
        System.out.println("\nString Queue :\n" + pq4);
        System.out.println("Peek : "+pq4.peek());
        System.out.println("Poll : "+pq4.poll());
        System.out.println(pq4);
        //Float
        PriorityQueue<Float> pq5 = new PriorityQueue<>();
        pq5.add(55.5f);
        pq5.add(33.3f);
        pq5.add(22.2f);
        pq5.add(11.1f);
        pq5.add(77.7f);
        System.out.println("\nFloat Queue :\n" + pq5);
        System.out.println("Peek : "+pq5.peek());
        System.out.println("Poll : "+pq5.poll());
        System.out.println(pq5);
        //Long
        PriorityQueue<Long> pq6 = new PriorityQueue<>();
        pq6.add(10000L);
        pq6.add(30000L);
        pq6.add(20000L);
        pq6.add(50000L);
        pq6.add(70000L);
        System.out.println("\nLong Queue :\n" + pq6);
        System.out.println("Peek : "+pq6.peek());
        System.out.println("Poll : "+pq6.poll());
        System.out.println(pq6);
        //Boolean
        PriorityQueue<Boolean> pq7 = new PriorityQueue<>();
        pq7.add(true);
        pq7.add(false);
        pq7.add(true);
        pq7.add(true);
        pq7.add(false);
        System.out.println("\nBoolean Queue :\n" + pq7);
        System.out.println("Peek : "+pq7.peek());
        System.out.println("Poll : "+pq7.poll());
        System.out.println(pq7);
    }
}
