package com.quest.Collections.Map;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(6,"Banana");
        treeMap.put(2,"Orange");
        treeMap.put(5,"Apple");
        treeMap.put(4,"Watermelon");
        treeMap.put(3,"Mango");
        treeMap.put(1,"Pineapple");

        System.out.println("Replaced : \n"+treeMap.replace(1,"Banana","Guva"));
        treeMap.forEach((k,v)->System.out.println(k+" : "+v));

        System.out.println(treeMap.remove(3,"Mango"));
        System.out.println(treeMap.ceilingEntry(4));
    }
}
