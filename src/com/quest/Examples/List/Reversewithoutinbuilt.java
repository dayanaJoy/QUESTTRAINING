package com.quest.Examples.List;

import java.util.ArrayList;
import java.util.List;

public class Reversewithoutinbuilt {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Original list : "+list);
        //Collections.reverse(list);
        int start = 0;
        int end = list.size() - 1;
        while (start <= end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
        System.out.println("Reversed list : "+list);
    }
}
