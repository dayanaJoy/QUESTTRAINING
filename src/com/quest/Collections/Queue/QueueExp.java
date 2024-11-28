package com.quest.Collections.Queue;

import java.util.*;

public class QueueExp {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(8);
        pq.add(5);
        pq.add(7);
        pq.add(9);
        //pq.forEach(System.out::println);
        /*Iterator<Integer> it = pq.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();*/
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        //It's following FIFO
        pq2.add("a");
        pq2.add("b");
        pq2.add("c");
        pq2.add("d");
        pq2.add("e");
       // pq2.add(null);
        pq2.forEach(System.out::println);
        System.out.println();
        //System.out.println(pq2.peek()); //peek is for stack
        System.out.println(pq2.poll());
        System.out.println();
        pq2.forEach(System.out::println);
        System.out.println();
        //System.out.println(pq2.offer("q"));//add or offer both same add goes to default method offer.
        //System.out.println(pq2.remove());// first element remove by default not in stack.
       // System.out.println();
        /*Spliterator<String> spliterator = pq2.spliterator();
        while (spliterator.tryAdvance(System.out::println)) {
            System.out.println(spliterator.getExactSizeIfKnown());
        }*/
        //String[] str = pq2.toArray(new String[pq2.size()]);
        //System.out.println(str.);
        //pq2.forEach(System.out::println);
        System.out.println();

        Stack<String> stack = new Stack<>();
        //It's following LIFO
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        //System.out.println(stack.peek());
        //System.out.println(stack.pop());
        System.out.println();
        //stack.forEach(System.out::println);
    }
}
