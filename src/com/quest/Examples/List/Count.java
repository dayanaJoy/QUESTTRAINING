package com.quest.Examples.List;

import java.util.*;

public class Count {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5,2,9,1,5,3,2,1,2,2));
        System.out.println("List : " + list);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : list) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
