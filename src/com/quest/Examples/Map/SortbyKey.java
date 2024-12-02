package com.quest.Examples.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortbyKey {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Banana", 2);
        map.put("Orange", 1);
        map.put("Apple", 3);
        map.put("Watermelon", 4);
        map.put("Pineapple", 6);
        map.put("Mango", 5);
        System.out.println("Map : " + map);
        Map<String, Integer> map2 = new TreeMap<>(map);
        System.out.println("Map2 : " + map2);
    }
}
